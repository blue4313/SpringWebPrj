package myspring.user.test;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.user.dao.UserDao;
import myspring.user.service.UserService;
import myspring.user.vo.UserVO;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans.xml")
//@ContextConfiguration(locations="classpath:config/users-beans.xml")
//@ContextConfiguration(locations="classpath:config/aop-beans.xml")
//@ContextConfiguration({"classpath:config/users-beans.xml", "classpath:config/aop-beans.xml"})
//@ContextConfiguration(
//	{
//		"classpath:config/users-beans.xml"
//		, "classpath:config/aop-beans.xml"
//	}
//)
public class UserClient {

	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserService service;
	
	@Autowired
	UserVO user;
	
	@Test
	public void daoTest() {
		UserDao dao = context.getBean(UserDao.class);
		
//		for (UserVO vo : dao.readAll()) {
//			System.out.println(vo);
//		}
//		
//		System.out.println();
		
		System.out.println(dao.read("leekijun"));
	}
	
	@Test
	@Ignore
	public void configTest(){
		SqlSession session = context.getBean("sqlSession", SqlSession.class);
		System.out.println(session.getClass().getName());
		
		UserVO vo = session.selectOne("userNS.selectUserById", "gildong");
		System.out.println(vo);
	}
	
	@Test
	@Ignore
	public void dataSourceTest() {
		DataSource ds = (DataSource) context.getBean("dataSource");
		
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Ignore
	public void getUserTest() {
				
		service = context.getBean(UserService.class);
		UserVO user = service.getUser("dooly");
		System.out.println(user);
		assertEquals("정둘리", user.getName());
	}
	
	@Test
	@Ignore
	public void deleteUserTest() {
		service.deleteUser("gildong");
		
		for (UserVO user : service.getUserList()) {
			System.out.println(user);
		}
	}
	
	@Test
	@Ignore
	public void updateUserTest() {
		
		//service.updateUser(new UserVO("dooly", "정둘리", "여", "부산"));
		service.updateUser(new UserVO("gildong", "홍길동2", "남2", "경기2"));
		
		for (UserVO user : service.getUserList()) {
			System.out.println(user);
		}
	}
	
	@Test
	@Ignore
	public void insertUserTest() {
		
		user.setUserId("leekijun");
		user.setName("이기준");
		user.setGender("남");
		user.setCity("수원");
		
		service.insertUser(user);
		
		//service.insertUser(new UserVO("dooly", "둘리", "여", "경기"));
		
		for (UserVO user : service.getUserList()) {
			System.out.println(user);
		}
	}
	
	@Test
	@Ignore
	public void getUserListTest() {
		
		for (UserVO user : service.getUserList()) {
			System.out.println(user);
		}
		
	}

}

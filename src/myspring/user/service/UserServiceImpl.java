package myspring.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.user.dao.UserDao;
import myspring.user.vo.UserVO;

//@Service("userService")
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userdao;
	
	@Override
	public void insertUser(UserVO user) {
		// TODO Auto-generated method stub
		userdao.insert(user);
	}

	@Override
	public List<UserVO> getUserList() {
		// TODO Auto-generated method stub
		return userdao.readAll();
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		userdao.delete(id);
	}

	@Override
	public UserVO getUser(String id) {
		// TODO Auto-generated method stub
		return userdao.read(id);
	}

	@Override
	public void updateUser(UserVO user) {
		// TODO Auto-generated method stub
		userdao.update(user);
	}
	
}

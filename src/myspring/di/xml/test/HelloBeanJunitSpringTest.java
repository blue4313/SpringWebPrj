package myspring.di.xml.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
//import org.junit.Assert;

import java.util.List;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans.xml")
public class HelloBeanJunitSpringTest {

	@Autowired
	ApplicationContext context;
	
//	@Before
//	public void init(){
//		//context = new ClassPathXmlApplicationContext("config/beans.xml");
//		context = new GenericXmlApplicationContext("config/beans.xml");
//	}
	
	@Test
	//@Ignore
	public void test3(){
		
		Printer printer = (Printer) context.getBean("printer");
		
		//Hello hello = (Hello) context.getBean("hello3");
		Hello hello = (Hello) context.getBean("hello3", Hello.class);
		
		assertEquals("Hello Spring33", hello.sayHello());
		hello.print();
		
		System.out.println(printer.toString());
		
		System.out.println();
		
		for (String s : hello.getNames()) {
			System.out.println(s);
		}
		
	}
	
	@Test
	@Ignore
	public void test2(){
		Hello hello = (Hello) context.getBean("hello");
		
		Hello hello2 = (Hello) context.getBean("hello");
		
		assertSame(hello, hello2);
	}
	
	@Test
	@Ignore
	public void test1() {
		
		Printer printer = (Printer) context.getBean("printer");
		//System.out.println(printer.toString());

		Hello hello = (Hello) context.getBean("hello2");
		
		//System.out.println(hello.sayHello());
		assertEquals("Hello Spring2", hello.sayHello());
		//assertEquals("Hello Spring", hello.sayHello());
		hello.print();
		
		assertEquals("Hello Spring2", printer.toString());

//		assertEquals(3, hello.getNames().size());
		
//		List<String> list = hello.getNames();
//		
//		for (String s : list) {
//			System.out.println(s);
//		}
//		
//		System.out.println();
//		
//		for (String s : hello.getNames()) {
//			System.out.println(s);
//		}
		
		//System.out.println(hello.getNames().size());
		
		
		
		

	}

}

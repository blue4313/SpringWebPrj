package myspring.di.xml.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
//import org.junit.Assert;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

public class HelloBeanJunitTest {

	ApplicationContext context;
	
	@Before
	public void init(){
		//context = new ClassPathXmlApplicationContext("config/beans.xml");
		context = new GenericXmlApplicationContext("config/beans.xml");
	}
	
	@Test
	//@Ignore
	public void test2(){
		Hello hello = (Hello) context.getBean("hello");
		
		Hello hello2 = (Hello) context.getBean("hello");
		
		assertSame(hello, hello2);
	}
	
	@Test
	//@Ignore
	public void test1() {
		
		Hello hello = (Hello) context.getBean("hello");
		
		//System.out.println(hello.sayHello());
		assertEquals("Hello Spring!", hello.sayHello());
		//assertEquals("Hello Spring", hello.sayHello());
		hello.print();
		
		Printer printer = (Printer) context.getBean("printer");
		//System.out.println(printer.toString());
		assertEquals("Hello Spring!", printer.toString());

	}

}

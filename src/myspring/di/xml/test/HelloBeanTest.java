package myspring.di.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

public class HelloBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuffer buffer = new StringBuffer();
//		
//		buffer.append("hello ");
//		buffer.append("world");
//		
//		System.out.println(buffer.toString());

		ApplicationContext context = null;
		
		//context = new ClassPathXmlApplicationContext("config/beans.xml");
		context = new GenericXmlApplicationContext("config/beans.xml");
		Hello hello = (Hello) context.getBean("hello");
		//Hello hello2 = (Hello) context.getBean("hello2");
		//Hello hello = context.getBean("hello", Hello.class);
		
		System.out.println(hello.sayHello());
		hello.print();
		
		Printer printer = (Printer) context.getBean("printer");
		//Printer printer = context.getBean("printer", Printer.class);
		System.out.println(printer.toString());
		
		//System.out.println(hello == hello2);
	}

}

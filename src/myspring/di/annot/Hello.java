package myspring.di.annot;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	@Value("${myname}")
	private String name;
	
//	@Autowired
//	@Qualifier("stringPrinter")
	@Resource(name="${printer1}")
	private Printer printer;
	
	private List<String> names;
	private Map<String, Integer> ages;
	
	public Hello() {
		// TODO Auto-generated constructor stub
	}
	
	public Hello(String name, Printer printer) {
		super();
		this.name = name;
		this.printer = printer;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Printer getPrinter() {
//		return printer;
//	}
//
//	public void setPrinter(Printer printer) {
//		this.printer = printer;
//	}
//
//	public List<String> getNames() {
//		return names;
//	}
//
//	public void setNames(List<String> names) {
//		this.names = names;
//	}
//
//	public Map<String, Integer> getAges() {
//		return ages;
//	}
//
//	public void setAges(Map<String, Integer> ages) {
//		this.ages = ages;
//	}

	public String sayHello() {
		return "Hello " + name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
}

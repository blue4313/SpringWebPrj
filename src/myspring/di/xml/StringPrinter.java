package myspring.di.xml;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("stringPrinter")
public class StringPrinter implements Printer {

	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		buffer.append(message);
	}
	
	public String toString() {
		return this.buffer.toString();
	}

}

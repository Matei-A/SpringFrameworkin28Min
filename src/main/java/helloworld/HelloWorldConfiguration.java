package helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// JDK 16; creates setters, getters, toString and other? function for us
// keeps code tidy
record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ionut";
	}

	@Bean
	public int age() {
		return 95;
	}
	
	@Bean
	public Person person() {
		return new Person("Matei",25, new Address("Voinesti","Iasi"));
	}
	
	@Bean (name="address2") // replaces the name from address to address2
	public Address address() {
		return new Address("AmrStr", "Ibk");
	}
	
	@Bean (name="address3")
	@Primary
	public Address address3() {
		return new Address("Acasa", "LaCucuteni");
	}
	
	@Bean
	@Qualifier("person2qualifier")
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	


}

package dependencyInjection;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{

	
	Dependency1 dep1;
	
	
	Dependency2 dep2;
	
//	@Autowired
//	public YourBusinessClass(Dependency1 dep1, Dependency2 dep2) {
//		super();
//		System.out.println("Constructor inj");
//		this.dep1 = dep1;
//		this.dep2 = dep2;
//	}
	
	@Autowired
	public void setDep1(Dependency1 dep1) {
	System.out.println("setter inj");
		this.dep1 = dep1;
	}
	@Autowired
	public void setDep2(Dependency2 dep2) {
		this.dep2 = dep2;
	}

	public String toString() {
		return "Using " + dep1 + " and " + dep2;
	}
	
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}


@Configuration
@ComponentScan
public class DependencyInjectionApp {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionApp.class)) {
			
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(YourBusinessClass.class).toString());
		
		
		} 
	}

}

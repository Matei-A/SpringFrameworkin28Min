package BusinessCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype") // or value = ConfigurableBeanFactory.SCOPE_PROTOTYPE
//@Lazy
class protoClass {

	@Autowired
	private SomeDependency someDep;

	public protoClass() {
		super();
		System.out.println("Constructor protoClass");
	}

	public protoClass(SomeDependency someDep) {
		super();
		this.someDep = someDep;
		System.out.println("All deps are ready");
	}

	@PostConstruct
	void Init() {
		someDep.getReady();
	}

	
	@PreDestroy
	public void cleanUp() {
		
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("dep ready");
	}
}

@Configuration
@ComponentScan
public class BusinessApp {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BusinessApp.class)) {

			System.out.println(context.getBean(BusinessCalcService.class).findMax());

			
			

		}

	}

}

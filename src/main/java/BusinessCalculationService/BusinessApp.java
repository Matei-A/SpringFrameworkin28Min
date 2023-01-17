package BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class BusinessApp {

	
	public static void main(String[] args) {

		
		
		try (var context = new AnnotationConfigApplicationContext(BusinessApp.class)) {

			System.out.println(context.getBean(BusinessCalcService.class).findMax());
		
		}

	}

}

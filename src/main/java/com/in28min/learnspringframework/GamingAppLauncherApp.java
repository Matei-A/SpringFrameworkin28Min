package com.in28min.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.learnspringframework.game.GameRunner;
import com.in28min.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.in28min.learnspringframework.game")
public class GamingAppLauncherApp {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApp.class)) {
			
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		
		
		
		
		
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

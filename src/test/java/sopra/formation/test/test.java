package sopra.formation.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.formation.config.ApplicationConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);		
		context.close();
	}

}

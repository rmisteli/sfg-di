package ch.rmisteli.sfgdi;

import ch.rmisteli.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext cfx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) cfx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}

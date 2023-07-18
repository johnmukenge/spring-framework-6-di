package com.johnson.spring6webappdi;

import com.johnson.spring6webappdi.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6WebappDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6WebappDiApplication.class, args);

		MyController controller = (MyController) ctx.getBean(MyController.class);

		System.out.println("--------");
		System.out.println(controller.sayHello());
	}

}

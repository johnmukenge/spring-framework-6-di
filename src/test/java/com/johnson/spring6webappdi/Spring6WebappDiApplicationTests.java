package com.johnson.spring6webappdi;

import com.johnson.spring6webappdi.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6WebappDiApplicationTests {

	// Spring will inject the context into this variable.
	@Autowired
	ApplicationContext ctx;

	// we are asking Spring to inject the controller into this variable.
	@Autowired
	MyController controller;

	@Test
	void testAutowiredOfController() {
		System.out.println("--------");
		System.out.println(controller.sayHello());
	}

	// Spring will inject the context into this variable.
	@Test
	void testGetControllerFromCtx() {
		MyController controller = (MyController) ctx.getBean(MyController.class);

		System.out.println("--------");
		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}

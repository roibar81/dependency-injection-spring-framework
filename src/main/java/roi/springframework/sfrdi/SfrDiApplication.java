package roi.springframework.sfrdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import roi.springframework.sfrdi.controllers.MyController;

@SpringBootApplication
public class SfrDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfrDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}

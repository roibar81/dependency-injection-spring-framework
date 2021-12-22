package roi.springframework.sfrdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import roi.springframework.sfrdi.controllers.ConstructorInjectedController;
import roi.springframework.sfrdi.controllers.MyController;
import roi.springframework.sfrdi.controllers.PropertyInjectedController;
import roi.springframework.sfrdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfrDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfrDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);


		System.out.println("-------- Propery");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());



	}

}

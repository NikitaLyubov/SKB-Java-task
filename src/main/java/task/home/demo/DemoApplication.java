package task.home.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import injection.field.BookStore;
import injection.constructor.Car;
import injection.setter.MyService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskConfiguration.class);
		var car = applicationContext.getBean("car", Car.class);
		car.startCar();
		var service = applicationContext.getBean("service", MyService.class);
		service.testDependency();
		var bookStore = applicationContext.getBean("bookStore", BookStore.class);
		bookStore.testingInjection();
		var phone = applicationContext.getBean("phone", Phone.class);
		phone.sendMessage();
		phone.destroy();
	}
}

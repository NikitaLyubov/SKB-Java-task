package task.home.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import injection.field.BookStore;
import injection.field.Somthing;
import injection.constructor.Car;
import injection.constructor.Engine;
import injection.setter.Dependency;
import injection.setter.MyService;

import java.util.logging.Logger;

@Configuration
public class TaskConfiguration {

   // Constructor Injection
    @Bean
    public Car car(Engine engine){
        System.out.println("Создался бин 'car'");
        return new Car(engine);
    }

    @Bean
    public Engine engine(){
        System.out.println("Создался бин 'engine'");
        return new Engine();
    }

    // Setter Injection
    @Bean
    MyService service(){
        System.out.println("Создался бин 'service'");
        var a = new MyService();
        a.setDependency(new Dependency());
        return a;
    }

    @Bean
    public Dependency createDependency() {
        System.out.println("Создался бин 'dependency'");
        return new Dependency();
    }

    // Field Injection
    @Bean
    public BookStore bookStore() {
        System.out.println("Создался бин 'bookStore'");
        return new BookStore();
    }

    @Bean
    public Somthing somthing(){
        System.out.println("Создался бин 'somthing'");
        return new Somthing();
    }

    //

    @Bean Telegram telegram(){
        System.out.println("Создался бин 'telegram'");
        return new Telegram();
    }

    @Bean
    public WhatsApp whatsApp(){
        System.out.println("Создался бин 'whatsapp'");
        return new WhatsApp();
    }

    @Bean
    public Phone phone(Telegram telegram, WhatsApp whatsApp){
        //System.out.println("Создался бин 'phone'");
        return new Phone(telegram, whatsApp);
    }


}

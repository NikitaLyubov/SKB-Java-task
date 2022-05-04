package injection.constructor;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void runEngine(){
        System.out.println("Engine Started");
    }
}

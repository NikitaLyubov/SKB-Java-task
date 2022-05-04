package injection.constructor;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void startCar(){
        engine.runEngine();
    }
}

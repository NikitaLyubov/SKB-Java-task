package injection.field;

import org.springframework.beans.factory.annotation.Autowired;

public class BookStore {
    @Autowired
    public Somthing somthing;

    public void testingInjection(){
        somthing.printSmth();
    }
}

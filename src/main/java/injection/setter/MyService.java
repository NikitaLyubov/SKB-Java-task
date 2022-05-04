package injection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private Dependency dependency;

    @Autowired
    public void setDependency(Dependency dependency){
        this.dependency = dependency;
    }

    public void testDependency()
    {
        dependency.testMethod();
    }
}

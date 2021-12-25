package roi.springframework.sfrdi.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import roi.springframework.sfrdi.serices.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    //@Autowired is default with constructor.
    // We do not @Qualifier annotate so spring inject the dependency of serviceObject with the @Primary annotate.
    // If we don't have Primary service? we must define one and only one!!
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

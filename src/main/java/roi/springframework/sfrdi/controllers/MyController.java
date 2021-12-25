package roi.springframework.sfrdi.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import roi.springframework.sfrdi.serices.GreetingService;

@Controller
public class MyController {

    GreetingService greetingService;

    //@Autowired is default with constructor.
    // Because we do not @Qualifier annotate spring inject the serviceObject with the @Primary annotate.
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

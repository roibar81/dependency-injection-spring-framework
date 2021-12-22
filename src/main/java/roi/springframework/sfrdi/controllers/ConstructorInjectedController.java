package roi.springframework.sfrdi.controllers;

import org.springframework.stereotype.Controller;
import roi.springframework.sfrdi.serices.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //The default for inject with Constructor is Autowired, so we not have to annotate it.
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

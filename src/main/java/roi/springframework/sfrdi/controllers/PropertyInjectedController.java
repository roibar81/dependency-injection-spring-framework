package roi.springframework.sfrdi.controllers;

import roi.springframework.sfrdi.serices.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

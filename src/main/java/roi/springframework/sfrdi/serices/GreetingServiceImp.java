package roi.springframework.sfrdi.serices;

public class GreetingServiceImp implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}

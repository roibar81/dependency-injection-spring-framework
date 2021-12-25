package roi.springframework.sfrdi.serices;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import roi.springframework.sfrdi.controllers.MyController;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - From the Primary Bean";
    }
}

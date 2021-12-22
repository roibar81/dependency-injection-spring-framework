package roi.springframework.sfrdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import roi.springframework.sfrdi.serices.GreetingServiceImp;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new GreetingServiceImp();
    }

    @Test
    void getGreeting() {

        System.out.println(propertyInjectedController.getGreeting());
    }
}
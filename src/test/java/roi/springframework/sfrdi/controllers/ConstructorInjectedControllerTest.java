package roi.springframework.sfrdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import roi.springframework.sfrdi.serices.GreetingServiceImp;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImp());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}
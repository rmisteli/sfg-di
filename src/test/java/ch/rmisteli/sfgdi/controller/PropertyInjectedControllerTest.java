package ch.rmisteli.sfgdi.controller;

import ch.rmisteli.sfgdi.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }


    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}

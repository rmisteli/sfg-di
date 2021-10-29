package ch.rmisteli.sfgdi.controller;

import ch.rmisteli.sfgdi.service.GreetingService;

/**
 * ConstructorInjectedController
 * Author: rmisteli
 * Created: 29.10.21 - 08:39
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

package ch.rmisteli.sfgdi.controller;

import ch.rmisteli.sfgdi.service.GreetingService;

/**
 * SetterInjectedController
 * Author: rmisteli
 * Created: 29.10.21 - 08:35
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

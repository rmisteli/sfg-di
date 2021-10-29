package ch.rmisteli.sfgdi.controller;

import ch.rmisteli.sfgdi.service.GreetingService;

/**
 * PropertyInjectedController
 * Author: rmisteli
 * Created: 29.10.21 - 08:29
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

package ch.rmisteli.sfgdi.service;

/**
 * SetterInjectedGreetingService
 * Author: rmisteli
 * Created: 29.10.21 - 09:04
 */
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}

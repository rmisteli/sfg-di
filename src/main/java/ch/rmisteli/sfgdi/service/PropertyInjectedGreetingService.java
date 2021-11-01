package ch.rmisteli.sfgdi.service;

/**
 * PropertyInjectedService
 * Author: rmisteli
 * Created: 29.10.21 - 09:00
 */
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}

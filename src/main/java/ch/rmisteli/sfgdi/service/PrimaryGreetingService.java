package ch.rmisteli.sfgdi.service;

/**
 * PrimaryGreetingService
 * Author: rmisteli
 * Created: 29.10.21 - 09:09
 */
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Primary";
    }
}

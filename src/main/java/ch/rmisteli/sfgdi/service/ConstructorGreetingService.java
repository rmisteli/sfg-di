package ch.rmisteli.sfgdi.service;

/**
 * GreetingServiceImpl
 * Author: rmisteli
 * Created: 29.10.21 - 08:28
 */
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

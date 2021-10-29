package ch.rmisteli.sfgdi.service;

import org.springframework.stereotype.Service;

/**
 * GreetingServiceImpl
 * Author: rmisteli
 * Created: 29.10.21 - 08:28
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

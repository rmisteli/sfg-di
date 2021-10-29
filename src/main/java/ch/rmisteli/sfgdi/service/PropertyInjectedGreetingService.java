package ch.rmisteli.sfgdi.service;

import org.springframework.stereotype.Service;

/**
 * PropertyInjectedService
 * Author: rmisteli
 * Created: 29.10.21 - 09:00
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}

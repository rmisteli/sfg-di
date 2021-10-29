package ch.rmisteli.sfgdi.service;

import org.springframework.stereotype.Service;

/**
 * SetterInjectedGreetingService
 * Author: rmisteli
 * Created: 29.10.21 - 09:04
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}

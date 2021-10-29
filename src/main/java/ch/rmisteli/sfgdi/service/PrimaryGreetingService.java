package ch.rmisteli.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * PrimaryGreetingService
 * Author: rmisteli
 * Created: 29.10.21 - 09:09
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Primary";
    }
}

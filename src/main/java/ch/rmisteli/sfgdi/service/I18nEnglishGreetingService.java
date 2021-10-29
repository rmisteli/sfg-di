package ch.rmisteli.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * I18nGreetingService
 * Author: rmisteli
 * Created: 29.10.21 - 09:18
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}

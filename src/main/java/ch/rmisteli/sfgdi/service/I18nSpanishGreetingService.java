package ch.rmisteli.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * I18nSpanishGreetingService
 * Author: rmisteli
 * Created: 29.10.21 - 09:19
 */
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

package ch.rmisteli.sfgdi.service;

/**
 * I18nGreetingService
 * Author: rmisteli
 * Created: 29.10.21 - 09:18
 */
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}

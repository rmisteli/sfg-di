package ch.rmisteli.sfgdi.config;

import ch.rmisteli.sfgdi.service.ConstructorGreetingService;
import ch.rmisteli.sfgdi.service.PropertyInjectedGreetingService;
import ch.rmisteli.sfgdi.service.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * GreetingServiceConfig
 * Author: rmisteli
 * Created: 01.11.21 - 08:51
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}

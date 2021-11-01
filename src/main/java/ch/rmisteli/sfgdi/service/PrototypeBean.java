package ch.rmisteli.sfgdi.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * PrototypeBean
 * Author: rmisteli
 * Created: 01.11.21 - 09:56
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println(" --- Creating a PrototypeBean!!!");
    }

    public String getMyScope() {
        return "I'm a Prototype";
    }
}

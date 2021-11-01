package ch.rmisteli.sfgdi.service;

import org.springframework.stereotype.Component;

/**
 * SingletonBean
 * Author: rmisteli
 * Created: 01.11.21 - 09:52
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println(" --- Creating a SingletonBean");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}

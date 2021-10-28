package ch.rmisteli.sfgdi.controller;

import org.springframework.stereotype.Controller;

/**
 * MyController
 * Author: rmisteli
 * Created: 28.10.21 - 14:46
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello world!!");

        return "Hi Folks!";
    }
}

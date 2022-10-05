package de.playground.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service("helloService")
public class HelloService {

    public String greetings(String name) {
        return "Greetings " + name + ". This is your coding playground :)!";
    }
}

package de.playground.controller;

import de.playground.service.HelloService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("/hello")
@CrossOrigin
@RestController
public class HelloController {

    private final HelloService helloService;

    @GetMapping
    public String getHelloMessage(@RequestParam("name") String name) {
        return this.helloService.greetings(name);
    }
}

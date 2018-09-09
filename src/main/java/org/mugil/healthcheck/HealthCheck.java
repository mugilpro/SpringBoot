package org.mugil.healthcheck;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @RequestMapping("/health")
    public String sayHello(){
        return "Application is working";
    }
}

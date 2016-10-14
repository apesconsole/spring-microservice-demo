package com.apesconsole.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	private Service service;
	
    @RequestMapping("/sayhi/{message}")
    public String serviceInstancesByApplicationName(
            @PathVariable String message) {
        return service.sayHello(message);
    }
	
}

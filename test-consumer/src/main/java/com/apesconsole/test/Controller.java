package com.apesconsole.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Controller {

	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate; 
	
    @RequestMapping("/consumer/{message}")
    public String getMessageFromServer(
            @PathVariable String message) {
        return restTemplate.getForObject("http://APES-SERVICE/sayhi/" + message, String.class);
    }
	
}

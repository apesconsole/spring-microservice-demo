package com.apesconsole.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {
	
	public String sayHello(final String parameter){
		return "Well, Hello "  + parameter + " !!";
	}
	
}

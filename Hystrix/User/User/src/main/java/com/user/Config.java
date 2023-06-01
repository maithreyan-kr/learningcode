package com.user;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@EnableAutoConfiguration
@EnableWebMvc
public class Config 
{
	@Bean 
	  @LoadBalanced
	  RestTemplate restTemplate()
	  { 
	    return new RestTemplate(); 
	  } 

}

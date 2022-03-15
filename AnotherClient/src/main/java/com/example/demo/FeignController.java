package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class FeignController{
	
	@Autowired
	FeignConsumer consumer;
	
	@HystrixCommand(fallbackMethod = "getFallbackMessage")
	@RequestMapping("/consume")
	String getMessage()
	{
		return("Consumed message is: "+ consumer.getConsumedMessage());
	}
	
	String getFallbackMessage()
	{
		return "No answer from config client";
	}
}

package com.example.demo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "client-server")
@RibbonClient(name = "client-server")
public interface FeignConsumer {

	@RequestMapping("/message")
	String getConsumedMessage();
}

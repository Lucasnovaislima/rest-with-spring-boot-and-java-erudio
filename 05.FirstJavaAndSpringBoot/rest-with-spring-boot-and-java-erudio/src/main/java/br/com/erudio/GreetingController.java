package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %S!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greetin")
	public Greeting greetin(
			@RequestParam(value = "name" , defaultValue = "world")
			String name) {
		
		    return new Greeting(counter.incrementAndGet(), String.format(template, name)) ;
	}
	
	

}

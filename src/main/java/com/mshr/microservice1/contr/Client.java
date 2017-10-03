package com.mshr.microservice1.contr;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client {

	@GetMapping(value = "/")
	public String hello() {
		return "Hello World,Alhamdulillah";
	}

}

package com.sapi.restsapi;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class firstapi {

	@GetMapping("Hello")
	public String hellomethod() {
		
		return "Hello Subex";
	}
}

package com.arthas.demo;

import com.arthas.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages = "com.arthas")
@RestController
public class DemoApplication {


	@Autowired
	private   MyService myService;

	//scanBasePackages = "com.arthas" 此处才有myService.
//	public DemoApplication(MyService myService) {
//	 	this.myService = myService;
//	}

	public DemoApplication( ) {

	}

	@GetMapping("/")
	public String home() {
		return myService.message();
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

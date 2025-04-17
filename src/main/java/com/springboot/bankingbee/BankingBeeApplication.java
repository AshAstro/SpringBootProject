package com.springboot.bankingbee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class BankingBeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingBeeApplication.class, args);
	}
	@GetMapping("/Hello")
	public String Hello(){
		return "<h1>Welcome to Banking Bee</h1>";
	}

}

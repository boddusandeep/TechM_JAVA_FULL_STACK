package com.commandLine.spring_boot_commandLine_exp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCommandLineExpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCommandLineExpApplication.class, args);
		
		System.out.print("hii this is the main class");
	}

}

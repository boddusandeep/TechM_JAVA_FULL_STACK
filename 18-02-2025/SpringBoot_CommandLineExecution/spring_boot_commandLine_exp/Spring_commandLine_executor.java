package com.commandLine.spring_boot_commandLine_exp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Spring_commandLine_executor implements CommandLineRunner {
	
	    
		public void run(String...args)  throws Exception
		{
			System.out.println("Hi..Executing CommandLine Runner");
			System.out.println(args[1]);
			
			System.out.println(Arrays.asList(args));
			System.out.println("End of the Command Line Runner");
				
		}
}

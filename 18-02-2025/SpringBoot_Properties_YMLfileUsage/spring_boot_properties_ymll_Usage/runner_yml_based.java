package com.using.properties.ymlfile.spring_boot_properties_ymll_Usage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class runner_yml_based implements CommandLineRunner {
			
	@Value("${my.id}")
	private int prodId;
	@Value("${my.cost}")
	private String prodCode;
	
	@Override
	public String toString() {
		return "SpringBootRunnerInputData [prodid=" + prodId + ",prodCode= " + prodCode +"]";
		} 
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.toString());
		 System.out.println("hiii  run method is executed ");
		 
		
	}
	

}

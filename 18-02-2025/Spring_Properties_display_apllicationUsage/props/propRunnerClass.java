package com.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class propRunnerClass implements CommandLineRunner {
	
	@Value("${my.info.product.id}")
	private int prodId;
	@Value("${my.info.product.code}")
	private String prodCode;
	@Value("${my.info.product.model-version}")
	private double modelver;
	@Value("${my.info.product.release_enable}")
	
	
	
	@Override
	public String toString() {
		return "SpringBootRunnerInputData [prodid=" + prodId + ",prodCode=" + prodCode +
				",modelVer=" + modelver + ",isDetEnable="  + "]";
	}
	
	public void run(String...args) throws Exception{
		System.out.println(this);
		
		//System.out.println(this.toString());
	}

	

}

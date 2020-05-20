package com.luv2code.ecommerceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EcommerceProjectApplication {

	public static void main(String[] args) {
		MyDatabase myDatabase=new MyDatabase();
		myDatabase.getData();
		System.out.print("Under SpringBoot");
		SpringApplication.run(EcommerceProjectApplication.class, args);
	}

}

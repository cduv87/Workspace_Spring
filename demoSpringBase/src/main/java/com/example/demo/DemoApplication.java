package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bll.ContactManager;
import com.example.demo.bo.Contact;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ContactManager manager;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		manager.addContact(new Contact("Dassin","Joe","666"));
		manager.getAllContact().forEach(System.out::println);
		
	}

}

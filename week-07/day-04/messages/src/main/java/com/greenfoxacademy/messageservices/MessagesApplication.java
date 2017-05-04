package com.greenfoxacademy.messageservices;

import com.greenfoxacademy.messageservices.service.MessageProceeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagesApplication implements CommandLineRunner {
	@Autowired
	MessageProceeder messageProceeder;

	public static void main(String[] args) {
		SpringApplication.run(MessagesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    System.out.println(messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com"));
	}



}

package com.greeenfoxacademy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanApplication implements CommandLineRunner {
	@Autowired
	HelloWorld helloWorld;
  @Autowired
	MyColor redColor;

	public static void main(String[] args) {

		SpringApplication.run(BeanApplication.class, args);

	}

  public void run(String... args) throws Exception {
    helloWorld.setMessage("Hello World");
    helloWorld.getMessage();
    redColor.printColor();
  }
}

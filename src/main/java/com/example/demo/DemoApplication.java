package com.example.demo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
@RestController
public class DemoApplication {

	ArrayList<String> record = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/api")
	public String api(@RequestBody String message) {
		record.add(message);
		System.out.println(message);
		return message;
	}

	@GetMapping("/clean")
	public void clean() {
		record.clear();
	}

	@GetMapping("/record")
	public ArrayList<String> getRecord() {
		return record;
	}


}

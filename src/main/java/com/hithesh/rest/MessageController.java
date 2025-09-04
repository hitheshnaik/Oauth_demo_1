package com.hithesh.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	@GetMapping("/")
	public ResponseEntity<?> getMsg(){
		String msg="Welcome to the  Earth";
		return ResponseEntity.ok(msg);
	}
}

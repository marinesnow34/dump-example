package com.example.dump.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dump.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	@GetMapping("/")
	public String home() {
		return "hi";
	}

	@GetMapping("/user")
	public String user(@RequestParam("idx") Long idx) {
		return userService.getUserNameById(idx);
	}

	@GetMapping("/name")
	public String name(@RequestParam("name") String name) {
		return userService.getUserAddressByName(name);
	}
}

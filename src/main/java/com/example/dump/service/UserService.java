package com.example.dump.service;

import org.springframework.stereotype.Service;

import com.example.dump.domain.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	public String getUserNameById(Long idx) {
		return userRepository.findByIdx(idx).getName();
	}

	public String getUserAddressByName(String name) {
		return userRepository.findByName(name).getAddress();
	}
}

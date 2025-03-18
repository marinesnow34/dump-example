package com.example.dump.domain;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByIdx(Long idx);
	User findByName(String name);
}

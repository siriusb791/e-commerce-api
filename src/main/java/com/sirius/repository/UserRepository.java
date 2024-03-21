package com.sirius.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}

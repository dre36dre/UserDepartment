package com.dre.userdept;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dre.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}

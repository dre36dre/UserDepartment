package com.dre.userdept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dre.userdept.UserRepository;
import com.dre.userdept.entities.User;

import jakarta.persistence.Id;

@RestController
@RequestMapping(value="/users")
public class UserController {

@Autowired
private UserRepository repository;

@GetMapping
public List<User> findAll(){
	List<User> result= repository.findAll();
	return result;
}

@GetMapping(value="/{id}")
public User findById(@PathVariable Long id){
	User result= repository.findById(id).get();
	return result;
}

@PostMapping
public User insert(@RequestBody User user){
	User result= repository.save(user);
	return result;
}

@DeleteMapping("/{id}")
public User<String> delete(@PathVariable("id") Long id){
	Optional<User> existingUser= this.repository.findById(id);
	if(existingUser.isPresent()){
            this.delete(existingProduct.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
	
	
}
}

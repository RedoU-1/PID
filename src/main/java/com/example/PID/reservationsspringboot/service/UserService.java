/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.service;

import com.example.PID.reservationsspringboot.model.User;
import com.example.PID.reservationsspringboot.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author redou
 */
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		
		userRepository.findAll().forEach(users::add);
		
		return users;
	}
	
	public User getUser(long id) {
		return userRepository.findById(id);
	}
 
	public void addUser(User user) {
		userRepository.save(user);
	}
 
	public void updateUser(long id, User user) {
		userRepository.save(user);
	}
 
	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}
}


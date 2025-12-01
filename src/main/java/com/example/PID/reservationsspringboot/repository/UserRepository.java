/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.repository;

import com.example.PID.reservationsspringboot.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author redou
 */
public interface UserRepository extends CrudRepository<User, Long> {
	User findByLogin(String login);
	List<User> findByLastname(String lastname);
	 
	User findById(long id);
}


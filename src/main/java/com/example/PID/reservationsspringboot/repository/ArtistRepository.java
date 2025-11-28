/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.PID.reservationsspringboot.repository;

/**
 *
 * @author redou
 */
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.PID.reservationsspringboot.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

    List<Artist> findByLastname(String lastname); 
    Artist findById(long id); 

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.service;

/**
 *
 * @author redou
 */
import com.example.PID.reservationsspringboot.model.Artist;
import com.example.PID.reservationsspringboot.repository.ArtistRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        List<Artist> artists = new ArrayList<>();
        artistRepository.findAll().forEach(artists::add); // Utilise la méthode du CrudRepository
        return artists;
    }

    public Artist getArtist(long id) {
        return artistRepository.findById(id);
    }

    public void addArtist(Artist artist) {
        artistRepository.save(artist); // Utilise la méthode du CrudRepository
    }

    public void updateArtist(long id, Artist artist) {
        artistRepository.save(artist); // save() met à jour si l'ID existe, sinon insère
    }

    public void deleteArtist(long id) {
        artistRepository.deleteById(id); // Utilise la méthode du CrudRepository
    }
}

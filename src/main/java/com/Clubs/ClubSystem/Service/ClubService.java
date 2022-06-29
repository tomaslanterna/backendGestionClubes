/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clubs.ClubSystem.Service;

import com.Clubs.ClubSystem.Logica.Club;
import com.Clubs.ClubSystem.Repositorios.ClubRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tomas
 */
@Service
public class ClubService {
    
    @Autowired
    private ClubRepo clubRepository;
    
    public Club insertarClub(Club unClub){
        return clubRepository.save(unClub);
    }
    
    public Club actualizarClube(Club unClub){
        return clubRepository.save(unClub);
    }
    
    public List<Club> getClubes(){
        return clubRepository.findAll();
    }
    
    public Club getClub(Club unClub){
        return clubRepository.getReferenceById(unClub.getClubId());
    }
    
    public void eliminarClub(Club unClub){
        clubRepository.delete(unClub);
    }
    
}

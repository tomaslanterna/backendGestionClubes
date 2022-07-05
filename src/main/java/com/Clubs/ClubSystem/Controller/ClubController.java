/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clubs.ClubSystem.Controller;

import com.Clubs.ClubSystem.Logica.Club;
import com.Clubs.ClubSystem.Service.ClubService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tomas
 */
@RestController
@RequestMapping("/clubes")
public class ClubController {
    
    @Autowired
    private ClubService clubServicio;
    
    @GetMapping
    public List<Club> getClubes(){
        try{
            return clubServicio.getClubes();
        }catch(Exception e){
            throw e;
        }
    }
    
    @PostMapping
    public Club guardarClub(@RequestBody Club unClub){
        try{
            return clubServicio.insertarClub(unClub);
        }catch(Exception e){
            throw e;
        }
    }
    
    @DeleteMapping
    public void eliminarClub(@RequestBody Club unClub){
        try{
            clubServicio.eliminarClub(unClub);
        }catch(Exception e){
            throw e;
        }
    }
    
    @PutMapping
    public Club actualizarClub(@RequestBody Club unClub){
        try{
            return clubServicio.actualizarClube(unClub);
        }catch(Exception e){
            throw e;
        }
    }
    
    
}

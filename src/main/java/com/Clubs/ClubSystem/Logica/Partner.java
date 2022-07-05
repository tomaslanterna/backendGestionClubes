/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clubs.ClubSystem.Logica;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author tomas
 */
@Entity
@Table(name = "Partners")
public class Partner extends User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer userId;
    @OneToMany(mappedBy="userId")
    private Set<Order> pedidosRealizados= new HashSet<Order>();
    @ManyToOne
    @JoinColumn(name = "Club_id", nullable = false)
    protected Club clubId;
    
    public Partner(Club club,String nombre,String password,String email){
        super(nombre,password,email);
        this.clubId=club;
    }
    
    
}

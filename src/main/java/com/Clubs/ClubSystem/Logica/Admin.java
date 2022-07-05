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
@Table(name = "Admins")
public class Admin extends User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer userId;
    @OneToMany(mappedBy="userId")
    private Set<Order> pedidosConfirmados= new HashSet<Order>();
    @ManyToOne
    @JoinColumn(name = "Club_id", nullable = false)
    protected Club clubId;
    
    public Admin(Club club,String nombre,String password,String email){
        super(nombre,password,email);
        this.clubId=club;
    }
    
}

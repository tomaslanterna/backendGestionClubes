/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clubs.ClubSystem.Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.CascadeType;
/**
 *
 * @author tomas
 */
@Entity
@Table(name="Clubes")
public class Club implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer clubId;
    @Column(unique=true)
    private String nombre;
    @OneToMany(mappedBy="clubId")
    private Set<ProductM> stockProductM=new HashSet<ProductM>();
    private Date fechaCreacion; 
    @OneToMany(mappedBy="clubId")
    private Set<User> partnersClub=new HashSet<User>();

    public Club(String nombre) {
        this.nombre = nombre;
    }
    
    public Club(){}

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<ProductM> getStockProductm() {
        return stockProductM;
    }

    public void setStockMarihuana(Set<ProductM> stockProductM) {
        this.stockProductM = stockProductM;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion() {
        this.fechaCreacion = new Date();
    }
    
    
}

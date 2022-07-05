/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clubs.ClubSystem.Logica;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tomas
 */
@Entity
@Table(name="productsm")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductM implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer productId;
    @Column(unique=true)
    private String nombre;
    private Integer stock;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name="Club_id",nullable=false)
    private Club clubId;
    
    public ProductM(String nombre,Integer stock,String descripcion){
        this.nombre=nombre;
        this.stock=stock;
        this.descripcion=descripcion;
    }
    
    public ProductM(){}

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Club getClubId() {
        return clubId;
    }
    
    public void setClubId(Club clubId) {
        this.clubId = clubId;
    }
}

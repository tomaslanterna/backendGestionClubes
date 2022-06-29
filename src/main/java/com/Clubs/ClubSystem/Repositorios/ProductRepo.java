/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Clubs.ClubSystem.Repositorios;

import com.Clubs.ClubSystem.Logica.ProductM;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tomas
 */
public interface ProductRepo extends JpaRepository<ProductM, Integer>{
    
}

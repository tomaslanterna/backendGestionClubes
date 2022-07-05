/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clubs.ClubSystem.Service;

import com.Clubs.ClubSystem.Logica.ProductM;
import com.Clubs.ClubSystem.Repositorios.ProductRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tomas
 */
@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepository;
    
    public ProductM instertarProduct(ProductM unProduct){
            return productRepository.save(unProduct);
    }
    
    public ProductM actualizarProduct(ProductM unProduct){
            return productRepository.save(unProduct);
    }
    
    public List<ProductM> getProducts(){
            return productRepository.findAll();
    }
    
    public void eliminarProduct(ProductM unProduct){
            productRepository.delete(unProduct);
    }
    
}

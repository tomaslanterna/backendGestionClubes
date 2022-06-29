/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clubs.ClubSystem.Controller;

import com.Clubs.ClubSystem.Logica.ProductM;
import com.Clubs.ClubSystem.Service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tomas
 */
@RestController
@RequestMapping("/products")
public class ProductMController {
    
    @Autowired
    private ProductService productServicio;
    
    @GetMapping
    public List<ProductM> getProductsM(){
        return productServicio.getProducts();
    }
    
    @PostMapping
    public ProductM crearProduct(@RequestBody ProductM unProduct){
        return productServicio.instertarProduct(unProduct);
    }
    
    @DeleteMapping
    public void eliminarProduct(@RequestBody ProductM unProduct){
        productServicio.eliminarProduct(unProduct);
    }
    
    @PutMapping
    public ProductM actualizarProduct(@RequestBody ProductM unProduct){
        return productServicio.actualizarProduct(unProduct);
    }
    
}

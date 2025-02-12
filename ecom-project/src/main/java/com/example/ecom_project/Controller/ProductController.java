package com.example.ecom_project.Controller;


import com.example.ecom_project.Model.Product;
import com.example.ecom_project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;



    @GetMapping("/products")
    public ResponseEntity<List<Product>> getallproducts(){
        return new ResponseEntity<>(service.getallproducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getproduct(@PathVariable int id){

        Product product = service.getproduct(id);
        if(product != null){
            return new ResponseEntity<>(product,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}

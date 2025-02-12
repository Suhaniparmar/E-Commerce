package com.example.ecom_project.Service;

import com.example.ecom_project.Model.Product;
import com.example.ecom_project.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getallproducts(){
       return productRepo.findAll();
    }

    public Product getproduct(int id) {
        return productRepo.findById(id).orElse(null);
    }
}

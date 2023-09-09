package com.example.ecommerceback.controller;

import com.example.ecommerceback.model.Product;
import com.example.ecommerceback.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/products")
public class ProductController {

    public ProductService productService;

    public  ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("")
    public List<Product> getAll(){
        return productService.getAll();

    }

    @PostMapping("")
    public void post(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable Long id){
        productService.deleteById(id);
    }


}

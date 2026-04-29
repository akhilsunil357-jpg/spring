package com.example.grocery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.grocery.models.products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class productcontroller {

    @GetMapping("/product")
    public String getProduct(Model model) {
        Product product = new Product(1,"Biscuit",(float) 45.3);
        model.addAttribute("product", product);
        return "product";
    }
}
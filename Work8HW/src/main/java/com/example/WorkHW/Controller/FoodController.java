package com.example.WorkHW.Controller;

import com.example.WorkHW.Model.Foodmodel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoodController {

    @GetMapping("/dish/{name}/{price}")
    public String getProductDetails(@PathVariable String name,
                                   @PathVariable double price,
                                   Model model) {

        Foodmodel product = new Foodmodel();   // create object

        product.setName(name);                 // set values
        product.setPrice(price);

        model.addAttribute("product", product); // send to view

        return "food";              // HTML file name
    }
}
package com.example.Work7.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Work7.Repository.booksrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.Work7.Model.booksmodel; 
@Controller
public class bookscontroller {

	@GetMapping("/books")
	public String Product(Model model) {
	    model.addAttribute("message", "Enter Your books Details");
	    return "books";
	}
	@Autowired
	private booksrepository booksrepository;
	@PostMapping("/save-product")
	public String Product(booksmodel productData,Model model) {
	    
	    booksmodel n = new booksmodel();
	    n.setName(productData.getName());
	    n.setDescription(productData.getDescription());    
	    n.setPrice(productData.getPrice()); 
	    booksrepository.save(n);
	    
	    model.addAttribute("message", "The product " + productData.getName() +" is saved successfully");
	    return "books"; 
	    
	    
	} 
	
	@GetMapping("/view")
	public String showProducts(Model model) {
		 Iterable<booksmodel> productList = booksrepository.findAll();
	    model.addAttribute("products", productList);
	    return "view";
	}

}
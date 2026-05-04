package com.example.Work8C.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Work8C.Repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.Work8C.Model.Mobilemodel; 
@Controller
public class MobileController {

	@GetMapping("/mobile")
	public String Product(Model model) {
	    model.addAttribute("message", "Enter Your mobile Details");
	    return "mobile";
	}
	@Autowired
	private MobileRepository productRepository;
	@PostMapping("/save-product")
	public String Product(Mobilemodel productData,Model model) {
	    
	    Mobilemodel n = new Mobilemodel();
	    n.setName(productData.getName());
	    n.setBrand(productData.getBrand());    
	    n.setPrice(productData.getPrice()); 
	    productRepository.save(n);
	    
	    model.addAttribute("message", "The product " + productData.getName() +" is saved successfully");
	    return "mobile"; 
	} 

}
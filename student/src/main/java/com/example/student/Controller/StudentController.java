package com.example.student.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.student.Model.Student;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class StudentController {

 

    @GetMapping("/Student")
    public String getProducts(Model model) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(1, "Biscuit",(float) 36.7));
        student.add(new Student(2, "Chocolate",(float) 67.78));
        student.add(new Student(3, "Chips",(float) 90.89));
        model.addAttribute("products", student);
        return "student";
    }
}
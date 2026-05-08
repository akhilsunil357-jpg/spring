package com.example.Work11HW2.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Work11HW2.Model.Users;

public interface UserRepo extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}
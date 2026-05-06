package com.example.Work10HW.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Work10HW.Model.Users;

public interface UserRepo extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}
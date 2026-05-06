package com.example.Work10CW.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Work10CW.Models.user;

public interface UserRepository extends JpaRepository<user, Long> {
    user findByEmail(String email);
}
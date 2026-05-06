package com.example.Work9HW.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.Work9HW.Models.PhoneModel;
import java.util.List;

public interface PhoneRepository extends JpaRepository<PhoneModel, Integer> {
    @Query("SELECT p FROM PhoneModel p WHERE p.name LIKE %:keyword% OR p.description LIKE %:keyword%")
    List<PhoneModel> findAllByKeyword(@Param("keyword") String keyword);
}
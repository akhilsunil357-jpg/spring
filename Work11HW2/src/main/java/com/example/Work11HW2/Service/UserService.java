package com.example.Work11HW2.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Work11HW2.DTO.UserDto;
import com.example.Work11HW2.Model.Users;
import com.example.Work11HW2.Repository.UserRepo;

@Service
public class UserService{
   
    @Autowired
    private PasswordEncoder passwordEncoder;
   
    @Autowired
    private UserRepo userRepository;

    public Users save(UserDto userDto) {
        Users user = new Users(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()) , userDto.getFullname() ,userDto.getAddress(),userDto.getdob());
        return userRepository.save(user);
    }
}
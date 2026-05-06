package com.example.Work10HW.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Work10HW.DTO.UserDto;
import com.example.Work10HW.Model.Users;
import com.example.Work10HW.Repository.UserRepo;

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
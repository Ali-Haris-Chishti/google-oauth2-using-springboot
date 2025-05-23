package com.example.google.login.service;

import com.example.google.login.model.User;
import com.example.google.login.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
        if (user.getPassword() != null)
            user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user) ;

    }

    public User getUserByEmail(String email) {
        return repo.findByEmail(email);
    }
}

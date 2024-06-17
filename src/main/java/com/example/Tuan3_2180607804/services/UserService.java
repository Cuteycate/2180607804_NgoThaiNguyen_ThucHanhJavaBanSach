package com.example.Tuan3_2180607804.services;

import com.example.Tuan3_2180607804.entity.User;
import com.example.Tuan3_2180607804.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public void save(User user)
    {
        userRepository.save(user);
    }
}

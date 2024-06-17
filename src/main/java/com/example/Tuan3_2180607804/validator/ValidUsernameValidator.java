package com.example.Tuan3_2180607804.validator;

import com.example.Tuan3_2180607804.repository.IUserRepository;
import com.example.Tuan3_2180607804.validator.annotation.ValidUsername;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.PublicKey;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context)
            {
                if(userRepository == null)
                    return true;
                return userRepository.findByUsername(username) == null;
            }
}

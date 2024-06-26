package com.example.Tuan3_2180607804.validator;

import com.example.Tuan3_2180607804.entity.Category;
import com.example.Tuan3_2180607804.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context)
    {
        return category != null && category.getId() != null;
    }
}

package com.nishant.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.StringUtils;

public class EmployeeTypeValidator implements ConstraintValidator<ValidType, String> {
    @Override
    public void initialize(ValidType constraintAnnotation) {

        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        if (StringUtils.isBlank(value)) {
            return false;
        }

        return value.equals("PRIVATE") || value.equals("BUSINESS");
    }
}

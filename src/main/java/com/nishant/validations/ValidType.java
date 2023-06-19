package com.nishant.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidType {

    String message() default "Employee Type is invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

package com.dmtryii.sarafan.validations;

import com.dmtryii.sarafan.annotations.PasswordsMatches;
import com.dmtryii.sarafan.payload.request.SignupRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordsMatchesValidator implements ConstraintValidator<PasswordsMatches, Object> {

    @Override
    public void initialize(PasswordsMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        SignupRequest userSignupRequest = (SignupRequest) value;
        return userSignupRequest.getPassword().equals(userSignupRequest.getConfirmPassword());
    }
}

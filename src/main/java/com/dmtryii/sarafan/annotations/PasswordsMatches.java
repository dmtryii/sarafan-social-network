package com.dmtryii.sarafan.annotations;

import com.dmtryii.sarafan.validations.PasswordsMatchesValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordsMatchesValidator.class)
@Documented
public @interface PasswordsMatches {
    String message() default "Password do not match";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default {};
}

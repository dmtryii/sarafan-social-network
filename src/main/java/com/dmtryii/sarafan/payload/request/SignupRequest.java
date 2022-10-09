package com.dmtryii.sarafan.payload.request;

import com.dmtryii.sarafan.annotations.PasswordsMatches;
import com.dmtryii.sarafan.annotations.ValidEmail;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordsMatches
public class SignupRequest {
    @Email(message = "It should have email format")
    @NotEmpty(message = "User email is required")
    @ValidEmail
    private String email;
    @NotEmpty(message = "Please enter your firstname")
    private String firstname;
    @NotEmpty(message = "Please enter your lastname")
    private String lastname;
    @NotEmpty(message = "Please enter your username")
    private String username;
    @NotEmpty(message = "Password is required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;
}

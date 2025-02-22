package com.santechture.api.validation;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest implements Serializable {
    @NotBlank(message = "user.name.required")
    private String username;
    @NotBlank(message = "user.password.required")
    private String password;
}

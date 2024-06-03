package com.santechture.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthenticationRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    // getters and setters
}
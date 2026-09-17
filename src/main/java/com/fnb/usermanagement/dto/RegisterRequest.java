package com.fnb.usermanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterRequest {
    private String firstName;
    private String surname;
    private String email;
    private String password;
}

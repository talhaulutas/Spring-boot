package com.example.demo.Requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserAddRequest {
    @NotBlank
    private String name;
}


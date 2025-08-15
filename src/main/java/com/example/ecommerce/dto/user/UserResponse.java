package com.example.ecommerce.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    String id;
    String name;
    String email;
    String role;
    LocalDateTime lastLogin;
    LocalDateTime previousLogin;
    LocalDateTime createdAt;
    LocalDateTime passwordUpdatedAt;
    boolean online;
    boolean active;

}
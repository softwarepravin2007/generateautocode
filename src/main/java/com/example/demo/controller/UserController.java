package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public ResponseEntity<Map<String, Object>> createUser(@Valid @RequestBody UserRequest request) {
        Map<String, Object> response = new HashMap<>();
        response.put("id", UUID.randomUUID().toString());
        response.put("name", request.getName());
        response.put("email", request.getEmail());
        response.put("age", request.getAge());
        response.put("phone", request.getPhone());
        response.put("message", "User created successfully");
        return ResponseEntity.ok(response);
    }
}


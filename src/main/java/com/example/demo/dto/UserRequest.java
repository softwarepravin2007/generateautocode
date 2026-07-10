package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserRequest {

    @NotBlank(message = "name is mandatory")
    private String name;

    @NotBlank(message = "email is mandatory")
    @Email(message = "email must be a valid email address")
    private String email;

    @NotNull(message = "age is mandatory")
    @Min(value = 0, message = "age must be >= 0")
    private Integer age;

    // Optional field
    private String phone;
    
    @NotBlank(message = "email is mandatory")
    private String test;

    public String getTest() { return test; }
    public void setTest(String test) { this.test = test; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}


package com.desafio.desafiobackend.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class UserRegisterDto {

    @Id
    private String id;
    public String email;
    public String name;

    public UserRegisterDto(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

package com.example.bts.Model;

public class LoginResponse {

    String token;
    String email;
    String username;

    public LoginResponse(String token, String email, String username) {
        this.token = token;
        this.email = email;
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public String getEmail(){
        return email;
    }

    public String getUsername(){
        return username;
    }
}

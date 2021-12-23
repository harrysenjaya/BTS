package com.example.bts.Model;

import com.google.gson.annotations.SerializedName;

public class Register {

    @SerializedName("email")
    String email;

    @SerializedName("username")
    String username;

    @SerializedName("password")
    String password;

    public Register(String email, String password, String username) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
}

package com.example.bts;

import com.example.bts.Model.Checklist;
import com.example.bts.Model.Login;
import com.example.bts.Model.LoginResponse;
import com.example.bts.Model.Register;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/login")
    public Call<LoginResponse> login(@Body Login login);

    @POST("/register")
    public Call<Void> register(@Body Register register);

    @GET("/checklist")
    public Call<Checklist> getChecklist(@Header("Authorization") String authHeader);
}

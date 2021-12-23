package com.example.bts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bts.Model.Login;
import com.example.bts.Model.LoginResponse;
import com.example.bts.Model.Register;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText password = this.findViewById(R.id.signin_password);
        EditText username = this.findViewById(R.id.signin_username);
        Button login = this.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login loginModel = new Login(username.getText().toString(),password.getText().toString());
                Call<LoginResponse> loginResponse = new NetworkUtil().getApi().login(loginModel);
                loginResponse.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        if(response.isSuccessful()){
                            if(response.body().getToken()!=null){
                                Constant.EMAIL = response.body().getEmail();
                                Constant.TOKEN = response.body().getToken();
                                Constant.USERNAME = response.body().getUsername();

                                Intent intent = new Intent(LogInActivity.this, ChecklistActivity.class);
                                startActivity(intent);
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {

                    }
                });
            }
        });
    }
}

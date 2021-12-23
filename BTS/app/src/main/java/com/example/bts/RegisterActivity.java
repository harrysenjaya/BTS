package com.example.bts;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bts.Model.LoginResponse;
import com.example.bts.Model.Register;

import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText email = this.findViewById(R.id.signup_email);
        EditText password = this.findViewById(R.id.signup_password);
        EditText username = this.findViewById(R.id.signup_username);
        TextView message = this.findViewById(R.id.signup_message);
        Button register = this.findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register registerModel = new Register(email.getText().toString(),password.getText().toString(),username.getText().toString());
                new NetworkUtil().getApi().register(registerModel).enqueue(new Callback() {
                    @Override
                    public void onResponse(Call call, Response response) {
                            if(response.isSuccessful()) {
                                message.setText("Proses save berhasil");
                            }
                    }

                    @Override
                    public void onFailure(Call call, Throwable t) {

                    }
                });
            }
        });
    }
}

package com.example.tuan8firebase;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
    EditText txtEmail,txtPass;
    Button btnLogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        txtEmail = findViewById(R.id.txtEmail);
        txtPass = findViewById(R.id.txtPass);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = txtEmail.getText().toString().trim();
                String password = txtPass.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    txtEmail.setError("Email không được để trống!");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    txtEmail.setError("Mật khẩu không được để trống!");
                    return;
                }
            }
        });
    }
}

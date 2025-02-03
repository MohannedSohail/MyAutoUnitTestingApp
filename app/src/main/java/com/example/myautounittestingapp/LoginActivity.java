package com.example.myautounittestingapp;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myautounittestingapp.databinding.ActivityLoginBinding;
import com.example.myautounittestingapp.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.etEmail.getText().toString();
                String password = binding.etPassword.getText().toString();
                if (email != null && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    binding.tvemail.setText("Email: Is Valid");
                    binding.tvemail.setTextColor(ContextCompat.getColor(LoginActivity.this, android.R.color.holo_green_dark));


                } else {

                    binding.tvemail.setText("Email: Is NotValid");
                    binding.tvemail.setTextColor(ContextCompat.getColor(LoginActivity.this, android.R.color.holo_red_dark));

                }

                if (password.length() > 6) {
                    binding.tvPassword.setText("Password: Is Valid");
                    binding.tvPassword.setTextColor(ContextCompat.getColor(LoginActivity.this, android.R.color.holo_green_dark));

                } else {

                    binding.tvPassword.setText("Password: Is NotValid");
                    binding.tvPassword.setTextColor(ContextCompat.getColor(LoginActivity.this, android.R.color.holo_red_dark));

                }


            }
        });


    }
}
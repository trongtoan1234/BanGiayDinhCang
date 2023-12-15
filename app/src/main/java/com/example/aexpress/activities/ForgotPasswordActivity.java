package com.example.aexpress.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aexpress.Fragment.Fragment_Validate_Forgot_Password;
import com.example.aexpress.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password2);

        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.frg_ForgotPassword, new Fragment_Validate_Forgot_Password())
                    .commit();
        }
    }
}
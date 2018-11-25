package com.davidmiguel.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openHiddenPinActivity(View view) {
        Intent intent = new Intent(this, HiddenPinActivity.class);
        startActivity(intent);
    }

    public void openOTPActivity(View view) {
        Intent intent = new Intent(this, OTPActivity.class);
        startActivity(intent);
    }

    public void openPasswordActivity(View view) {
        Intent intent = new Intent(this, PasswordActivity.class);
        startActivity(intent);
    }
}

package com.isil.baazar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> {
            mostrarMain();
        }, 3000);
    }

    private void mostrarMain() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }


}
package com.isil.baazar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroPageActivity extends AppCompatActivity  implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);
        Button mbtnIniciarSesion = findViewById(R.id.btnSignIn);
        Button mbtnTakeLook = findViewById(R.id.btnTakeLook);

        mbtnIniciarSesion.setOnClickListener(this);
        mbtnTakeLook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSignIn:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.btnTakeLook:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}
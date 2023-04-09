package com.example.ferizy_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class aktifAct extends AppCompatActivity {

    public ImageView rumah,profil;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktif);

        rumah = findViewById(R.id.home);
        profil = findViewById(R.id.people);
        rumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(itn);
                finish();
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), AkunActivity.class);
                startActivity(itn);
                finish();
            }
        });

    }
}
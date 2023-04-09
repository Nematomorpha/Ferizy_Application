package com.example.ferizy_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AkunActivity extends AppCompatActivity {


    public ImageView kembali,search,user,hubungi,history,rumah,pesananSaya;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun2);
        kembali =findViewById(R.id.tandaK);
        search =findViewById(R.id.search);
        user =findViewById(R.id.user);
        hubungi =findViewById(R.id.telphone);
        history =findViewById(R.id.riwayat);
        rumah = findViewById(R.id.home);
        pesananSaya = findViewById(R.id.pt_pes);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(itn);
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), CekPemesananAct.class);
                startActivity(itn);
                finish();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), ProfilAct.class);
                startActivity(itn);
                finish();
            }
        });

        hubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), HubungiAct.class);
                startActivity(itn);
                finish();
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), HistoryAct.class);
                startActivity(itn);
                finish();
            }
        });

        rumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(itn);
                finish();
            }
        });

        pesananSaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), aktifAct.class);
                startActivity(itn);
                finish();
            }
        });



    }
}
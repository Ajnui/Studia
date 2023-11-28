package com.example.intencje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity extends AppCompatActivity {

    Button powrot;

Bundle odebrane;
String[] imiona = {"Maja", "Kasia", "Ola"};
TextView message;


String klucz;
static final int NUMER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        Intent wywolanie = getIntent();
        powrot=findViewById(R.id.goBack);
        message = (TextView) findViewById(R.id.message);
        for (int i = 0; i<MainActivity.klucze.length; i++){
            String klucz = MainActivity.klucze[i]+"\n";


        }
message.setText(klucz);
        odebrane = wywolanie.getExtras();

        String tekst = " ";



            }
            public void powrot(View view){
        finish();

            }
        }






package com.example.intencje;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static String[] klucze = {"jeden", "dwa", "trzy"};
    TextView tView;
    Button ativityStart;
    static final int NUMER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView = (TextView) findViewById(R.id.message);
        ativityStart = (Button) findViewById(R.id.activityStart);

    }
    public void guzik(View kotlecik){
        Intent intencja = new Intent();
        intencja.setClass(this, Activity.class);
        intencja.putExtra(klucze[0], "kowalski");
        intencja.putExtra(klucze[1], "Lewandowski");
        intencja.putExtra(klucze[2], "Wiśniewski");
        startActivity(intencja);
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == NUMER){
            Bundle bun = data.getExtras();
            String text = " ";
            tView.setText(text);

            }
        }
    }


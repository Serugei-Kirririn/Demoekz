package com.example.demoekz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menupokachto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupokachto);

    }
    public void onClickSignIn (View v) {

        Intent intent2 = new Intent(Menupokachto.this, Settings.class);
        startActivity(intent2);
    }
    public void onClickSignhis (View v) {

        Intent intent2 = new Intent(Menupokachto.this, History.class);
        startActivity(intent2);
    }
}
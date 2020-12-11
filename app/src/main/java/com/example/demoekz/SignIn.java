package com.example.demoekz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void onClickSignIn (View v) {

        Intent intent2 = new Intent(SignIn.this, signup.class);
        startActivity(intent2);
    }
    public void onClickPass(View v){
        EditText qwe = (EditText)findViewById(R.id.editText);
        EditText asd = (EditText)findViewById(R.id.editText3);

        if(qwe.getText().toString().equals( "serk")) {
            if (asd.getText().toString().equals("123")) {
                Intent intent2 = new Intent(SignIn.this, MapsActivity.class);
                startActivity(intent2);
            }

        }

        else
        {
            Toast.makeText(this, "Неправильный пароль или логин", Toast.LENGTH_SHORT).show();
        }


    }
}


/*




* */
package com.example.demoekz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void onClickPass(View v){
        EditText pas1 = (EditText)findViewById(R.id.editText5);
        EditText pas2 = (EditText)findViewById(R.id.editText6);

        if(pas1.getText().toString().equals( pas2.getText().toString())){
            Toast.makeText(this, "Пароли совпадают", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this, "Пароли не совпадают", Toast.LENGTH_SHORT).show();
        }

    }
}

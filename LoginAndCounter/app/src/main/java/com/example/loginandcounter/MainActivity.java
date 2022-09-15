package com.example.loginandcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText user = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText pass = (EditText) findViewById(R.id.editTextTextPassword);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String username = user.getText().toString();
                String password = pass.getText().toString();
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t = (TextView) findViewById(R.id.textView4);
                int i = Integer.parseInt(t.getText().toString()) + 1;
                t.setText(String.valueOf(i));
            }
        });
    }
}
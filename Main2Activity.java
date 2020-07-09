package com.example.med;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class Main2Activity extends AppCompatActivity {

    //EditText uname;
    EditText email;
    EditText pass;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();


        //uname = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText10);
        pass = (EditText) findViewById(R.id.editText11);
        button1=(Button)findViewById(R.id.button2) ;
        button2=(Button)findViewById(R.id.button4) ;
        //Parse.initialize(this, "h8up9mUy8RC8uubGJJKzPDbXANhqMlZ8jt7diWUH", "CxYmqiAgyaHArADvGZUSn9w2peO9wfzkbgYYdtwe");

        email.getText().toString();
        pass.getText().toString();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Main5Activity.class);
                startActivity(i);
            }
        });


    }




}




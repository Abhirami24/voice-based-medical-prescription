package com.example.med;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {


    EditText name,email,phone,pass,cnfrmpass;
    Button b;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        name=(EditText)findViewById(R.id.editText6);
        email=(EditText)findViewById(R.id.editText7);
        phone=(EditText)findViewById(R.id.editText12);
        pass=(EditText)findViewById(R.id.editText13);
        cnfrmpass=(EditText)findViewById(R.id.editText14);
        b=(Button)findViewById(R.id.button3);
        name.getText().toString();
        email.getText().toString();
        phone.getText().toString();
        pass.getText().toString();
        cnfrmpass.getText().toString();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });
    }


}

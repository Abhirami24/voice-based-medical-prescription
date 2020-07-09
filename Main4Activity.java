package com.example.med;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TableRow;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView serial,med,freq,dura,qnty;
    TableRow tb;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getIntent();
        serial=(TextView)findViewById(R.id.id1);
        med=(TextView)findViewById(R.id.id2);
        freq=(TextView)findViewById(R.id.id3);
        dura=(TextView)findViewById(R.id.id4);
        qnty=(TextView)findViewById(R.id.id5);
    }
}

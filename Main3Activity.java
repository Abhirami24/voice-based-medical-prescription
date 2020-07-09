package com.example.med;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.*;

public class Main3Activity extends AppCompatActivity {
    protected static final int RESULT_SPEECH = 1;

    EditText name, gender, age, diag, add, phone, mail;
    TextView date, time;
    ImageButton b1, b2, b3, b4, b5, b6, b7;
    Button but;
    SimpleDateFormat simpleDateFormat;
    String times;
    Calendar calender;
    public ArrayList<String> words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //Intent i = getIntent();
        b1 = (ImageButton) findViewById(R.id.imageButton);
        b2 = (ImageButton) findViewById(R.id.imageButton2);
        b3 = (ImageButton) findViewById(R.id.imageButton3);
        b4 = (ImageButton) findViewById(R.id.imageButton4);
        b5 = (ImageButton) findViewById(R.id.imageButton5);
        b6 = (ImageButton) findViewById(R.id.imageButton6);
        b7 = (ImageButton) findViewById(R.id.imageButton7);
        date = (TextView) findViewById(R.id.textView9);
        time = (TextView) findViewById(R.id.textView10);
        name = (EditText) findViewById(R.id.editText3);
        gender = (EditText) findViewById(R.id.editText4);
        age = (EditText) findViewById(R.id.editText5);
        diag = (EditText) findViewById(R.id.editText);
        phone = (EditText) findViewById(R.id.editText2);
        mail = (EditText) findViewById(R.id.editText8);
        add = (EditText) findViewById(R.id.editText9);
        but = (Button) findViewById(R.id.button);
        String date_n = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date());
        date.setText(date_n);
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
        times = simpleDateFormat.format(calender.getTime());
        time.setText(times);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(v.getContext(), Main6Activity.class);
                v.getContext().startActivity(intent1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 1);
                                          //initialises the text field
                                          name.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        b2.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 2);
                                          //initialises the text field
                                          gender.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 3);
                                          //initialises the text field
                                          age.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        b4.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 4);
                                          //initialises the text field
                                          diag.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 5);
                                          //initialises the text field
                                          phone.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        b6.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 6);
                                          //initialises the text field
                                          mail.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        b7.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 7);
                                          //initialises the text field
                                          add.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    name.setText(text.get(0));

                }
                break;
            }
            case 2: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    gender.setText(text.get(0));

                }
                break;
            }
            case 3: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    age.setText(text.get(0));

                }
                break;
            }
            case 4: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    diag.setText(text.get(0));

                }
                break;
            }
            case 5: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    phone.setText(text.get(0));

                }
                break;
            }
            case 6: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    mail.setText(text.get(0));

                }
                break;
            }
            case 7: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    add.setText(text.get(0));

                }
                break;
            }
        }


        /*but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });*/
    }



}


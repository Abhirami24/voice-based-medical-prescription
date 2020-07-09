package com.example.med;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.KITKAT;

public class Main6Activity extends AppCompatActivity {

    protected static final int RESULT_SPEECH = 1;
    private TableLayout llPdf;
    EditText med1,freq1,dura1,quantity1,med2,freq2,dura2,quantity2,med3,freq3,dura3,quantity3,med4,freq4,dura4,quantity4,med5,freq5,dura5,quantity5,med6,freq6,dura6,quantity6,med7,freq7,dura7,quantity7,med8,freq8,dura8,quantity8,med9,freq9,dura9,quantity9,med0,freq0,dura0,quantity0;
    ImageButton i11,i12,i13,i14,i21,i22,i23,i24,i31,i32,i33,i34,i41,i42,i43,i44,i51,i52,i53,i54,i61,i62,i63,i64,i71,i72,i73,i74,i81,i82,i83,i84,i91,i92,i93,i94,i01,i02,i03,i04;
    SignatureView signatureView;
    private Button clear,save;
    private Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        llPdf=(TableLayout)findViewById(R.id.Table);
        signatureView=(SignatureView)findViewById(R.id.signature_view) ;
        clear=(Button)findViewById(R.id.button1);
        save=(Button)findViewById(R.id.button2);
        med1=(EditText)findViewById(R.id.id12);
        freq1=(EditText)findViewById(R.id.id14);
        dura1=(EditText)findViewById(R.id.id16);
        quantity1=(EditText)findViewById(R.id.id18);
        i11=(ImageButton)findViewById(R.id.imageButton13);
        i12=(ImageButton)findViewById(R.id.imageButton15);
        i13=(ImageButton)findViewById(R.id.imageButton17);
        i14=(ImageButton)findViewById(R.id.imageButton19);
        med2=(EditText)findViewById(R.id.id22);
        freq2=(EditText)findViewById(R.id.id24);
        dura2=(EditText)findViewById(R.id.id26);
        quantity1=(EditText)findViewById(R.id.id18);
        i21=(ImageButton)findViewById(R.id.imageButton23);
        i22=(ImageButton)findViewById(R.id.imageButton25);
        i23=(ImageButton)findViewById(R.id.imageButton27);
        i24=(ImageButton)findViewById(R.id.imageButton29);
        med3=(EditText)findViewById(R.id.id32);
        freq3=(EditText)findViewById(R.id.id34);
        dura3=(EditText)findViewById(R.id.id36);
        quantity3=(EditText)findViewById(R.id.id38);
        i31=(ImageButton)findViewById(R.id.imageButton33);
        i32=(ImageButton)findViewById(R.id.imageButton35);
        i33=(ImageButton)findViewById(R.id.imageButton37);
        i34=(ImageButton)findViewById(R.id.imageButton39);
        med4=(EditText)findViewById(R.id.id42);
        freq4=(EditText)findViewById(R.id.id44);
        dura4=(EditText)findViewById(R.id.id46);
        quantity4=(EditText)findViewById(R.id.id48);
        i41=(ImageButton)findViewById(R.id.imageButton43);
        i42=(ImageButton)findViewById(R.id.imageButton45);
        i43=(ImageButton)findViewById(R.id.imageButton47);
        i44=(ImageButton)findViewById(R.id.imageButton49);
        med5=(EditText)findViewById(R.id.id52);
        freq5=(EditText)findViewById(R.id.id54);
        dura5=(EditText)findViewById(R.id.id56);
        quantity5=(EditText)findViewById(R.id.id58);
        i51=(ImageButton)findViewById(R.id.imageButton53);
        i52=(ImageButton)findViewById(R.id.imageButton55);
        i53=(ImageButton)findViewById(R.id.imageButton57);
        i54=(ImageButton)findViewById(R.id.imageButton59);
        med6=(EditText)findViewById(R.id.id62);
        freq6=(EditText)findViewById(R.id.id64);
        dura6=(EditText)findViewById(R.id.id66);
        quantity6=(EditText)findViewById(R.id.id68);
        i61=(ImageButton)findViewById(R.id.imageButton63);
        i62=(ImageButton)findViewById(R.id.imageButton65);
        i63=(ImageButton)findViewById(R.id.imageButton67);
        i64=(ImageButton)findViewById(R.id.imageButton69);
        med7=(EditText)findViewById(R.id.id72);
        freq7=(EditText)findViewById(R.id.id74);
        dura7=(EditText)findViewById(R.id.id76);
        quantity7=(EditText)findViewById(R.id.id78);
        i71=(ImageButton)findViewById(R.id.imageButton73);
        i72=(ImageButton)findViewById(R.id.imageButton75);
        i73=(ImageButton)findViewById(R.id.imageButton77);
        i74=(ImageButton)findViewById(R.id.imageButton79);
        med8=(EditText)findViewById(R.id.id82);
        freq8=(EditText)findViewById(R.id.id84);
        dura8=(EditText)findViewById(R.id.id86);
        quantity8=(EditText)findViewById(R.id.id88);
        i81=(ImageButton)findViewById(R.id.imageButton83);
        i82=(ImageButton)findViewById(R.id.imageButton85);
        i83=(ImageButton)findViewById(R.id.imageButton87);
        i84=(ImageButton)findViewById(R.id.imageButton89);
        med9=(EditText)findViewById(R.id.id92);
        freq9=(EditText)findViewById(R.id.id94);
        dura9=(EditText)findViewById(R.id.id96);
        quantity9=(EditText)findViewById(R.id.id98);
        i91=(ImageButton)findViewById(R.id.imageButton93);
        i92=(ImageButton)findViewById(R.id.imageButton95);
        i93=(ImageButton)findViewById(R.id.imageButton97);
        i94=(ImageButton)findViewById(R.id.imageButton99);
        med0=(EditText)findViewById(R.id.id02);
        freq0=(EditText)findViewById(R.id.id04);
        dura0=(EditText)findViewById(R.id.id06);
        quantity0=(EditText)findViewById(R.id.id08);
        i01=(ImageButton)findViewById(R.id.imageButton03);
        i02=(ImageButton)findViewById(R.id.imageButton05);
        i03=(ImageButton)findViewById(R.id.imageButton07);
        i04=(ImageButton)findViewById(R.id.imageButton09);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signatureView.clearCanvas();
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "PDF creation is done",
                        Toast.LENGTH_SHORT).show();
                Log.d("size"," "+llPdf.getWidth() +"  "+llPdf.getWidth());
                bitmap = loadBitmapFromView(llPdf, llPdf.getWidth(), llPdf.getHeight());
                createPdf();
            }
        });

        i11.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 11);
                                          //initialises the text field
                                          med1.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        i12.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 12);
                                          //initialises the text field
                                          freq1.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        i13.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 13);
                                          //initialises the text field
                                          dura1.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );
        i14.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                      Intent intent = new Intent(
                                              RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                      intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                      //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                      try {
                                          startActivityForResult(intent, 14);
                                          //initialises the text field
                                          quantity1.setText("");
                                      } catch (ActivityNotFoundException a) {
                                          Toast t = Toast.makeText(getApplicationContext(),
                                                  "Opps! Your device doesn't support Speech to Text",
                                                  Toast.LENGTH_SHORT);
                                          t.show();
                                      }
                                  }
                              }
        );

    i21.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            //the popup for the speech recognition using Googles Speech-to-Text API within the phone
            Intent intent = new Intent(
                    RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

            //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
            try {
                startActivityForResult(intent, 21);
                //initialises the text field
                med2.setText("");
            } catch (ActivityNotFoundException a) {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Opps! Your device doesn't support Speech to Text",
                        Toast.LENGTH_SHORT);
                t.show();
            }
        }
    }
        );
        i22.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            //the popup for the speech recognition using Googles Speech-to-Text API within the phone
            Intent intent = new Intent(
                    RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

            //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
            try {
                startActivityForResult(intent, 22);
                //initialises the text field
                freq2.setText("");
            } catch (ActivityNotFoundException a) {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Opps! Your device doesn't support Speech to Text",
                        Toast.LENGTH_SHORT);
                t.show();
            }
        }
    }
        );
        i23.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            //the popup for the speech recognition using Googles Speech-to-Text API within the phone
            Intent intent = new Intent(
                    RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

            //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
            try {
                startActivityForResult(intent, 23);
                //initialises the text field
                dura2.setText("");
            } catch (ActivityNotFoundException a) {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Opps! Your device doesn't support Speech to Text",
                        Toast.LENGTH_SHORT);
                t.show();
            }
        }
    }
        );
        i24.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            //the popup for the speech recognition using Googles Speech-to-Text API within the phone
            Intent intent = new Intent(
                    RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

            //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
            try {
                startActivityForResult(intent, 24);
                //initialises the text field
                quantity2.setText("");
            } catch (ActivityNotFoundException a) {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Opps! Your device doesn't support Speech to Text",
                        Toast.LENGTH_SHORT);
                t.show();
            }
        }
    }
        );

        i31.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 31);
                                           //initialises the text field
                                           med3.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i32.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 32);
                                           //initialises the text field
                                           freq3.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i33.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 33);
                                           //initialises the text field
                                           dura3.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i34.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 34);
                                           //initialises the text field
                                           quantity3.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );

        i41.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 41);
                                           //initialises the text field
                                           med4.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i42.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 42);
                                           //initialises the text field
                                           freq4.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i43.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 43);
                                           //initialises the text field
                                           dura4.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i44.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 44);
                                           //initialises the text field
                                           quantity4.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );

        i51.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 51);
                                           //initialises the text field
                                           med5.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i52.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 52);
                                           //initialises the text field
                                           freq5.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i53.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 53);
                                           //initialises the text field
                                           dura5.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i54.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 54);
                                           //initialises the text field
                                           quantity5.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );

        i61.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 61);
                                           //initialises the text field
                                           med6.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i62.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 62);
                                           //initialises the text field
                                           freq6.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i63.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 63);
                                           //initialises the text field
                                           dura6.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i64.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 64);
                                           //initialises the text field
                                           quantity6.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );

        i71.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 71);
                                           //initialises the text field
                                           med7.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i72.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 72);
                                           //initialises the text field
                                           freq7.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i73.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 73);
                                           //initialises the text field
                                           dura7.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i74.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 74);
                                           //initialises the text field
                                           quantity7.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );

        i81.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 81);
                                           //initialises the text field
                                           med8.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i82.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 82);
                                           //initialises the text field
                                           freq8.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i83.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 83);
                                           //initialises the text field
                                           dura8.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i84.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 84);
                                           //initialises the text field
                                           quantity8.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );

        i91.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 91);
                                           //initialises the text field
                                           med9.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i92.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 92);
                                           //initialises the text field
                                           freq9.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i93.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 93);
                                           //initialises the text field
                                           dura9.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i94.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 94);
                                           //initialises the text field
                                           quantity9.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );

        i01.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 01);
                                           //initialises the text field
                                           med0.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i02.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 02);
                                           //initialises the text field
                                           freq0.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i03.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 03);
                                           //initialises the text field
                                           dura0.setText("");
                                       } catch (ActivityNotFoundException a) {
                                           Toast t = Toast.makeText(getApplicationContext(),
                                                   "Opps! Your device doesn't support Speech to Text",
                                                   Toast.LENGTH_SHORT);
                                           t.show();
                                       }
                                   }
                               }
        );
        i04.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       //the popup for the speech recognition using Googles Speech-to-Text API within the phone
                                       Intent intent = new Intent(
                                               RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                                       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-GB");

                                       //tries to gather text from the spoken words; if spoken language is not available, an error is thrown.
                                       try {
                                           startActivityForResult(intent, 04);
                                           //initialises the text field
                                           quantity0.setText("");
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

    public static Bitmap loadBitmapFromView(View v, int width, int height) {
        Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        v.draw(c);

        return b;
    }

    @RequiresApi(api = KITKAT)
    public void createPdf(){
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        //  Display display = wm.getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        float hight = displaymetrics.heightPixels ;
        float width = displaymetrics.widthPixels ;

        int convertHighet = (int) hight, convertWidth = (int) width;

//        Resources mResources = getResources();
//        Bitmap bitmap = BitmapFactory.decodeResource(mResources, R.drawable.screenshot);

        PdfDocument document = new PdfDocument();
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(convertWidth, convertHighet, 1).create();
        PdfDocument.Page page = document.startPage(pageInfo);

        Canvas canvas = page.getCanvas();

        Paint paint = new Paint();
        canvas.drawPaint(paint);

        bitmap = Bitmap.createScaledBitmap(bitmap, convertWidth, convertHighet, true);

        paint.setColor(Color.BLUE);
        canvas.drawBitmap(bitmap, 0, 0 , null);
        document.finishPage(page);

        // write the document content
        String targetPdf = "/sdcard/pdffromlayout.pdf";
        File filePath;
        filePath = new File(targetPdf);
        try {
            document.writeTo(new FileOutputStream(filePath));

        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Something wrong: " + e.toString(), Toast.LENGTH_LONG).show();
        }

        // close the document
        document.close();
        Toast.makeText(this, "PDF is created!!!", Toast.LENGTH_SHORT).show();

        openGeneratedPDF();

    }

    private void openGeneratedPDF() {
        File file = new File("/sdcard/pdffromlayout.pdf");
        Intent intent;
        if (file.exists()) {
            intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.fromFile(file);
            intent.setDataAndType(uri, "application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(Main6Activity.this, "No Application available to view pdf", Toast.LENGTH_LONG).show();
            }
        }

    }

        protected void onActivityResult ( int requestCode, int resultCode, Intent intent){
            super.onActivityResult(requestCode, requestCode, intent);

            switch (requestCode) {
                case 11: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med1.setText(text.get(0));

                    }
                    break;
                }
                case 12: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq1.setText(text.get(0));

                    }
                    break;
                }
                case 13: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura1.setText(text.get(0));

                    }
                    break;
                }
                case 14: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity1.setText(text.get(0));

                    }
                    break;
                }
                case 21: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med2.setText(text.get(0));

                    }
                    break;
                }
                case 22: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq2.setText(text.get(0));

                    }
                    break;
                }
                case 23: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura2.setText(text.get(0));

                    }
                    break;
                }
                case 24: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity2.setText(text.get(0));

                    }
                    break;
                }
                case 31: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med3.setText(text.get(0));

                    }
                    break;
                }
                case 32: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq3.setText(text.get(0));

                    }
                    break;
                }
                case 33: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura3.setText(text.get(0));

                    }
                    break;
                }
                case 34: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity3.setText(text.get(0));

                    }
                    break;
                }
                case 41: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med4.setText(text.get(0));

                    }
                    break;
                }
                case 42: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq4.setText(text.get(0));

                    }
                    break;
                }
                case 43: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura4.setText(text.get(0));

                    }
                    break;
                }
                case 44: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity4.setText(text.get(0));

                    }
                    break;
                }

                case 51: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med5.setText(text.get(0));

                    }
                    break;
                }
                case 52: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq5.setText(text.get(0));

                    }
                    break;
                }
                case 53: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura5.setText(text.get(0));

                    }
                    break;
                }
                case 54: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity5.setText(text.get(0));

                    }
                    break;
                }
                case 61: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med6.setText(text.get(0));

                    }
                    break;
                }
                case 62: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq6.setText(text.get(0));

                    }
                    break;
                }
                case 63: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura6.setText(text.get(0));

                    }
                    break;
                }
                case 64: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity6.setText(text.get(0));

                    }
                    break;
                }
                case 71: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med7.setText(text.get(0));

                    }
                    break;
                }
                case 72: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq7.setText(text.get(0));

                    }
                    break;
                }
                case 73: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura7.setText(text.get(0));

                    }
                    break;
                }
                case 74: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity7.setText(text.get(0));

                    }
                    break;
                }
                case 81: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med8.setText(text.get(0));

                    }
                    break;
                }
                case 82: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq8.setText(text.get(0));

                    }
                    break;
                }
                case 83: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura8.setText(text.get(0));

                    }
                    break;
                }
                case 84: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity8.setText(text.get(0));

                    }
                    break;
                }
                case 91: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med9.setText(text.get(0));

                    }
                    break;
                }
                case 92: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq9.setText(text.get(0));

                    }
                    break;
                }
                case 93: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura9.setText(text.get(0));

                    }
                    break;
                }
                case 94: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity9.setText(text.get(0));

                    }
                    break;
                }
                case 01: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        med0.setText(text.get(0));

                    }
                    break;
                }
                case 02: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        freq0.setText(text.get(0));

                    }
                    break;
                }
                case 03: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        dura0.setText(text.get(0));

                    }
                    break;
                }
                case 04: {
                    if (resultCode == RESULT_OK && null != intent) {

                        ArrayList<String> text = intent
                                .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        quantity0.setText(text.get(0));

                    }
                    break;
                }

            }

        }

    }


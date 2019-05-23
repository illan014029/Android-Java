package com.example.doopliss.checkbox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox Negrita;
    CheckBox Cursiva;
    EditText edTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Negrita = (CheckBox) findViewById(R.id.Negrita);
        Cursiva = (CheckBox) findViewById(R.id.Cursiva);
        edTexto = (EditText) findViewById(R.id.editText5);
        Cursiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cursiva.isChecked() && !Negrita.isChecked()){
                    edTexto.setTypeface(null, Typeface.ITALIC);
                }else if(!Cursiva.isChecked() && Negrita.isChecked()){
                    edTexto.setTypeface(null, Typeface.BOLD);
                }else if(Cursiva.isChecked() && Negrita.isChecked()){
                    edTexto.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else if(!Cursiva.isChecked() && !Negrita.isChecked()){
                    edTexto.setTypeface(null, Typeface.NORMAL);
                }
            }
        });
        Negrita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Cursiva.isChecked() && Negrita.isChecked()){
                    edTexto.setTypeface(null, Typeface.BOLD);
                }else if(Cursiva.isChecked() && !Negrita.isChecked()){
                    edTexto.setTypeface(null, Typeface.ITALIC);
                } else if(Cursiva.isChecked() && Negrita.isChecked()){
                    edTexto.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else if(!Cursiva.isChecked() && !Negrita.isChecked()){
                    edTexto.setTypeface(null, Typeface.NORMAL);
                }
            }
        });
        }
    }
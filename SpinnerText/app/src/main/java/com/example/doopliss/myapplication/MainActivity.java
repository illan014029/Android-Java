package com.example.doopliss.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edTexto;
Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // buscar componentes
        edTexto = (EditText) findViewById(R.id.edTexto);
        spinner = (Spinner) findViewById(R.id.spinner);

        String []opciones = {"Normal","Negrita","Cursiva","Negrita y Cursiva" };
        // Adapter
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, opciones);
        //modelos
        spinner.setAdapter(adaptador);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               // View view, int position, long id;
                Log.e("APLICATION", "Presiono");
                String option = spinner.getSelectedItem().toString();
                switch (option){
                    case "Negrita":
                        edTexto.setTypeface(null, Typeface.BOLD);
                        break;
                    case "Cursiva":
                        edTexto.setTypeface(null, Typeface.ITALIC);
                        break;
                    case "Normal":
                        edTexto.setTypeface(null, Typeface.NORMAL);
                        break;
                    case "Negrita y Cursiva":
                        edTexto.setTypeface(null, Typeface.BOLD_ITALIC);
                        break;
                        default:
                            edTexto.setTypeface(null, Typeface.NORMAL);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

package com.example.callradio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton Add;
    RadioButton Resta;
    RadioButton Multi;
    RadioButton Div;
    EditText x;
    EditText y;
    Button Calcuar;
    TextView Resultado;
    int a=0, b=0, c=0;
    String Answer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add = (RadioButton) findViewById(R.id.RbAdd);
        Resta = (RadioButton) findViewById(R.id.RbRestar);
        Multi = (RadioButton) findViewById(R.id.RbMuti);
        Div = (RadioButton) findViewById(R.id.RbDiv);
        x = (EditText) findViewById(R.id.editText);
        y = (EditText) findViewById(R.id.editText2);
        Calcuar = (Button) findViewById(R.id.BtnCalcular);
        Resultado = (TextView) findViewById(R.id.textView);
    }
    public void Calculadora(View v){
        try{
            a = Integer.parseInt(String.valueOf(x.getText()));
            b = Integer.parseInt(String.valueOf(y.getText()));
            if (Add.isSelected()){
                c = a+b;
            }else if(Resta.isSelected()){
                c = a-b;
            }else if(Multi.isSelected()){
                c=a*b;
            }else if(Div.isSelected()){
                c=a/b;
            }
            Answer=String.valueOf(c);
            Resultado.setText("Resultado: " +Answer);

        }catch(Exception x){

        }

    }
}

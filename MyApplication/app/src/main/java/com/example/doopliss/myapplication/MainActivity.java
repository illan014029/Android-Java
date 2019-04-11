package com.example.doopliss.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.txtNum1)
    EditText txtNum1;
    @BindView(R.id.txtNum2)
    EditText txtNum2;

    @BindView(R.id.rbResta)
    RadioButton rbResta;
    @BindView(R.id.rbSuma)
    RadioButton rbSuma;

    @BindView(R.id.lblResultado)
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void hacerCalculo() {
        try {
            int x = 0, y = 0, z = 0;
            Toast.makeText(this, "presione", Toast.LENGTH_LONG).show();
            x = Integer.parseInt(txtNum1.getText().toString());
            y = Integer.parseInt(txtNum2.getText().toString());
            if (rbResta.isChecked()) {
                z = x - y;
            } else {
                z = x + y;
            }
            lblResultado.setText("" + z);
        }catch (Exception ex){
            Toast.makeText(this, ex.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
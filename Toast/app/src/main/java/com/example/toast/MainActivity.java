package com.example.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageButton boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (ImageButton) findViewById(R.id.imageButton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.activity_main, null);

                Toast toast = new Toast(getApplicationContext());

                toast.setDuration(Toast.LENGTH_LONG);

                toast.setView(layout);

                toast.show();
            }
        });
    }
}

package com.example.aplicationlista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   public class cursos{
       private String nombre;

       public String getNombre() {
           return nombre;
       }

       public void setNombre(String nombre) {
           this.nombre = nombre;
       }

       public double getPorcentaje() {
           return porcentaje;
       }

       public void setPorcentaje(double porcentaje) {
           this.porcentaje = porcentaje;
       }

       private double porcentaje;
   }
}

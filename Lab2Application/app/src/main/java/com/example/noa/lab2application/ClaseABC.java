package com.example.noa.lab2application;

import android.util.Log;

/**
 * Created by noa on 18/01/16.
 */
public class ClaseABC {

    String dato = "Carta";
    String val = Modelo.cadena[1];
    String [] cad = new String[10];


    public ClaseABC(){

    }

    public void setDato(String d){
        dato = d;
    }

    public String getDato(){
        return dato;
    }

    public void ejecutar(String dato){

        for(int i = 1; i<=10; i++){
            dato = "asdf";
        }
        if(cad.length >0) {
            for (String val_act : cad) {
                Log.i("cad", val_act);
            }
        }
    }
}

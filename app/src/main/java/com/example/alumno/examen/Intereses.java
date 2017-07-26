package com.example.alumno.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Intereses extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4,tv5;
    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intereses);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);

    }

    public void enviar(View view){
        String res1,res2,res3;
        if(rb1.isChecked())
            res1 = " Android Si";
        else
            res1 = "";
        if(rb3.isChecked())
            res2 = " Java Si";
        else
            res2 = "";
        if(rb5.isChecked())
            res3 = " Spring Si";
        else
            res3 = "";



        Toast notificacion;
        notificacion = Toast.makeText(this,"Preferencias listas para monitoreo " + res1 + res2 + res3 ,Toast.LENGTH_SHORT);
        notificacion.show();
    }
}

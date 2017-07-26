package com.example.alumno.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.password;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2,et3, et4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        tv1 = (TextView) findViewById(R.id.tv1);
    }

    public void confirmaClave(View view){
        String val1 = et3.getText().toString();
        String val2 = et4.getText().toString();
        Toast notificacion;

        if(val1.equals("android") && val2.equals("android")){
            Intent i = new Intent(this,Intereses.class);
            startActivity(i);

        }else {
            notificacion = Toast.makeText(this,"Credenciales inválidas",Toast.LENGTH_SHORT);
            notificacion.show();

        }
    }

    public void cancelar(View view){
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
    }

}

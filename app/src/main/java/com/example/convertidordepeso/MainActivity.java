package com.example.convertidordepeso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_ir;
    private EditText txt_nombre, txt_apellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ir = findViewById(R.id.btn_ir);
        txt_nombre = findViewById(R.id.txt_nombre);
        txt_apellido = findViewById(R.id.txt_apellido);

        btn_ir.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                if(txt_nombre.length() < 2){
                    Toast.makeText(getApplicationContext(), "Ingrese un nombre valido", Toast.LENGTH_SHORT).show();
                }else if(txt_apellido.length() < 2){
                    Toast.makeText(getApplicationContext(), "Ingrese un apellido valido", Toast.LENGTH_SHORT).show();
                }else{
                    Intent siguiente = new Intent(getApplicationContext(), convertidorActivity.class);
                    startActivity(siguiente);
                }
            }
        });

    }
}

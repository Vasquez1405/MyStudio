package com.example.mystudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class formulario extends AppCompatActivity {

    private EditText usuarioName;
    private EditText usuarioEmail;
    private EditText usuarioPhone;
    private EditText usuarioAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        usuarioName = (EditText) findViewById(R.id.usuarioName);
        usuarioEmail = (EditText) findViewById(R.id.usuarioEmail);
        usuarioPhone = (EditText) findViewById(R.id.usuarioPhone);
        usuarioAddress = (EditText) findViewById(R.id.usuarioAddress);

    }
    public void irAceptacion(View view){

        Intent i = new Intent(this,aceptacion.class);
        i.putExtra("dato_name",usuarioName.getText().toString());
        i.putExtra("dato_email",usuarioEmail.getText().toString());
        i.putExtra("dato_phone",usuarioPhone.getText().toString());
        i.putExtra("dato_address",usuarioAddress.getText().toString());
        startActivity(i);

    }
}
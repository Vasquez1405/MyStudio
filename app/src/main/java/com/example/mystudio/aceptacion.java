package com.example.mystudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aceptacion extends AppCompatActivity {
    private TextView aceptacionName;
    private TextView aceptacionEmail;
    private TextView aceptacionPhone;
    private TextView aceptacionAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptacion);

        aceptacionName = (TextView)findViewById(R.id.aceptacionName);
        aceptacionEmail = (TextView)findViewById(R.id.aceptacionEmail);
        aceptacionPhone = (TextView)findViewById(R.id.aceptacionPhone);
        aceptacionAddress = (TextView)findViewById(R.id.aceptacionAddress);

        String name = getIntent().getStringExtra("dato_name");
        aceptacionName.setText(name);

        String email = getIntent().getStringExtra("dato_email");
        aceptacionEmail.setText(email);

        String phone = getIntent().getStringExtra("dato_phone");
        aceptacionPhone.setText(phone);

        String address = getIntent().getStringExtra("dato_address");
        aceptacionAddress.setText(address);
    }
    public void irInicio(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
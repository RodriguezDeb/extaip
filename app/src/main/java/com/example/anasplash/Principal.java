package com.example.anasplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Button regresor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        regresor= (Button)findViewById(R.id.salir);
        regresor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresador = new Intent(Principal.this, Login.class);
                startActivity(regresador);
            }
        });
    }
}
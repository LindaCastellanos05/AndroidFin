package com.example.vistasproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vistasproyecto.R;

public class menuAdmin extends AppCompatActivity {
private Button btnverfacturas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);

        btnverfacturas = findViewById(R.id.btnventasadmin);

        btnverfacturas.setOnClickListener(this::verFacturas);
    }

    private void verFacturas(View view) {
        Intent intent = new Intent(menuAdmin.this, recyclerFactura.class);
        startActivity(intent);
    }
}
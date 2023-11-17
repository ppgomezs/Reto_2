package com.example.ecogardenapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EstadisticaEnergia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistica_energia);

        Button categorias = findViewById(R.id.categorias);
        Button crecimiento = findViewById(R.id.crecimiento);
        ImageButton home = findViewById(R.id.btn_home);

        categorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent categoriasActividad = new Intent(EstadisticaEnergia.this, Categorias.class);
                startActivity(categoriasActividad);

            }
        });

        crecimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent crecimientoActividad = new Intent(EstadisticaEnergia.this, EstadisticaCrecimiento.class);
                startActivity(crecimientoActividad);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeActividad = new Intent(EstadisticaEnergia.this, ZonaNavegacion.class);
                startActivity(homeActividad);
            }
        });
    }
}

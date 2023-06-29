package com.example.bikeshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Contactos extends AppCompatActivity {
    private ImageView voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        inicializar();
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intenderVoltar();
            }
        });
    }
    private void inicializar(){
        voltar = findViewById(R.id.id_voltar);
    }
    private void intenderVoltar(){
        Intent voltar = new Intent(Contactos.this,Menu.class);
        startActivity(voltar);
        finish();
    }
}
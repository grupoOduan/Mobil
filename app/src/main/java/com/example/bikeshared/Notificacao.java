package com.example.bikeshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Notificacao extends AppCompatActivity {
    private ImageView voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacao);
        inicializar();
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intender();
            }
        });
    }
    private void intender(){
        Intent voltar = new Intent(Notificacao.this, Menu_principal.class);
        startActivity(voltar);
        finish();
    }
    private void inicializar(){
        voltar = findViewById(R.id.id_voltar);
    }
}
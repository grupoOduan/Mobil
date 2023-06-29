package com.example.bikeshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.FirebaseApp;

public class Sobre extends AppCompatActivity {
    private ImageView id_volta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre2);
         inicializar();
        id_volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intenderVoltar();
            }
        });

    }
    private void  intenderVoltar(){
        Intent voltar = new Intent(Sobre.this,Menu.class);
        startActivity(voltar);
        finish();
    }
    private void inicializar(){
        id_volta = findViewById(R.id.id_voltar);
    }
}
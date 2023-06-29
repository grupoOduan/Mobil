package com.example.bikeshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    private ImageView id_volta;
    private TextView id_terminar,id_contato,id_mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        inicializar();

        id_terminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intenderTerminar();
            }
        });
        id_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intenderContato();
            }
        });
        id_volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intenderVoltar();
            }
        });
        id_mensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intenderMensagem();
            }
        });
    }
    private void intenderContato(){
        Intent contato = new Intent(Menu.this, Contactos.class);
        startActivity(contato);
        finish();
    }
    private void intenderTerminar(){
        Intent terminar = new Intent(Menu.this,Login.class);
        startActivity(terminar);
        finish();
    }
    private void intenderVoltar(){
        Intent voltar = new Intent(Menu.this,Menu_principal.class);
        startActivity(voltar);
        finish();
    }
    private void intenderMensagem(){
        Intent mensagem = new Intent(Menu.this,Mensagem.class);
        startActivity(mensagem);
        finish();
    }
    private void inicializar(){
        id_mensagem = findViewById(R.id.id_mensagem);
        id_contato = findViewById(R.id.id_contato);
        id_volta = findViewById(R.id.id_voltar);
        id_terminar= findViewById(R.id.id_terminar);
    }
}
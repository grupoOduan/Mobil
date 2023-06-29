package com.example.bikeshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu_principal extends AppCompatActivity {
    private ImageView id_menu,id_mensagem,id_notifica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        inicializar1();
        id_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interpretaMenu();
            }
        });
        id_mensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interpretaMensagem();
            }
        });
        id_notifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interpretaNotificacao();
            }
        });
    }
    private void interpretaMenu(){
        Intent menu = new Intent(Menu_principal.this,Menu.class);
        startActivity(menu);
        finish();
    }
    private void interpretaMensagem(){
        Intent menu = new Intent(Menu_principal.this,Mensagem.class);
        startActivity(menu);
        finish();
    }
    private void interpretaNotificacao(){
        Intent menu = new Intent(Menu_principal.this,Notificacao.class);
        startActivity(menu);
        finish();
    }
    private void inicializar1(){
        id_menu= findViewById(R.id.id_menu);
        id_mensagem = findViewById(R.id.id_mensagem);
        id_notifica =findViewById(R.id.id_notificacao);
    }
}
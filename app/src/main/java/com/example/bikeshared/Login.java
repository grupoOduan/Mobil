package com.example.bikeshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class Login extends AppCompatActivity {
   private Button id_criarConta,id_iniciar_sessao;
   private EditText email, senha;
   String[] mensagens = {"Preencha todos os campos","Credenciais ivalidas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        IniciarComponents();
        id_iniciar_sessao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(email.getText().toString().isEmpty()|| senha.getText().toString().isEmpty()){
                    mensagemDeAlerta(0, v);
                }else {
                    if(email.getText().toString().equals("lussevadiobernardo1996@gmail.com") && senha.getText().toString().equals("lussevadio1996")){
                        Intent iniciar_sessao = new Intent(Login.this,Menu_principal.class);
                        startActivity(iniciar_sessao);
                        finish();
                    }else{
                        mensagemDeAlerta(1,v);
                    }
                }

            }
        });
        id_criarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent criar = new Intent(Login.this, Criar_conta.class);
                startActivity(criar);
                finish();
            }
        });

    }
    private void  mensagemDeAlerta(int pos, View v){
        Snackbar snackbar=Snackbar.make(v,mensagens[pos],Snackbar.LENGTH_SHORT);
        snackbar.setBackgroundTint(Color.WHITE);
        snackbar.setTextColor(Color.BLACK);
        snackbar.show();
    }
    private void IniciarComponents(){
        id_criarConta = findViewById(R.id.id_criarConta);
        id_iniciar_sessao=findViewById(R.id.id_button_acesso);
        email = findViewById(R.id.edit_email);
        senha = findViewById(R.id.edit_senha);
    }
}
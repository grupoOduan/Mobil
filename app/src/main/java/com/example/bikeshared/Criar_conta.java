package com.example.bikeshared;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;

import java.security.Principal;

public class Criar_conta extends AppCompatActivity {
     private Button id_cancelar,id_cadastrar;
    private EditText nome_usuario,email,senha,confirmr_senha;
    String[] mensagens = {"Preencha todos os campos","Credenciais ivalidas","Verifica a senha","cadastrado com sucesso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);
                inciar_componets();

        id_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeUsuario = nome_usuario.getText().toString();
                String email1=email.getText().toString();
                String senha1=senha.getText().toString();
                String senha_confirmar = confirmr_senha.getText().toString();

                if(nomeUsuario.isEmpty() || email1.isEmpty() || senha1.isEmpty() || senha_confirmar.isEmpty()){
                    mensagemDeAlerta(0, v);
                }else{
                    cadastrar_usuario(v);
                }

            }
        });
        id_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelar = new Intent(Criar_conta.this, Login.class);
                startActivity(cancelar);
            }
        });
    }
    private void cadastrar_usuario(View v){
        String nome = nome_usuario.getText().toString();
        String email1=email.getText().toString();
        String senha1=senha.getText().toString();
        String confirmar = confirmr_senha.getText().toString();
        FirebaseDatabase database =FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(nome);
        if(confirmar.equals(senha1)){
            Ciclistas ciclista = new Ciclistas(1 , nome, senha1,email1,20);
            myRef.setValue(ciclista);

            Intent principal = new Intent(Criar_conta.this, Menu_principal.class);
            startActivity(principal);
            finish();
        }else{
            mensagemDeAlerta(2,v);
        }

    }
    private void inciar_componets(){
        nome_usuario=findViewById(R.id.id_txt_nome);
        email=findViewById(R.id.id_txt_email);
        senha=findViewById(R.id.id_txt_senha);
        confirmr_senha = findViewById(R.id.id_txt_confirmar);
        id_cadastrar=findViewById(R.id.id_confirmar);
        id_cancelar = findViewById(R.id.id_cancelar);
    }
    private void mensagemDeAlerta(int pos, View v){
        Snackbar snackbar=Snackbar.make(v,mensagens[pos],Snackbar.LENGTH_SHORT);
        snackbar.setBackgroundTint(Color.WHITE);
        snackbar.setTextColor(Color.BLACK);
        snackbar.show();
    }
}
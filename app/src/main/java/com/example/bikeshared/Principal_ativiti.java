package com.example.bikeshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class Principal_ativiti extends AppCompatActivity {

     private  ProgressBar id_progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_ativiti);
        Iniciar();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TelaLogin();
            }
        },3000);
    }
    private void TelaLogin(){
        Intent logi = new Intent(Principal_ativiti.this, Login.class);
        startActivity(logi);
        finish();
    }
    private void Iniciar(){
        id_progressbar=findViewById(R.id.id_prograssBar);
    }
}
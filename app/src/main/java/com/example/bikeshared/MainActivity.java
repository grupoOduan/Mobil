package com.example.bikeshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button id_bt_bem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id_bt_bem = findViewById(R.id.id_be);
        id_bt_bem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logi = new Intent(MainActivity.this, Login.class);
                startActivity(logi);
            }
        });

    }
}
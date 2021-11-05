package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto_hito);
        boton = findViewById(R.id.boton_hito);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int newText = texto.getText() == getText(R.string.after_msg).toString() ? R.string.initial_msg : R.string.after_msg;
                texto.setText(getText(newText));
            }
        });
    }
}
package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.fraseDia);
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void gerarNovaFrase(View view){



        String[] frases2 = {
                "Frase 1",
                "Frase 2",
                "Frase 3",
                "Frase 4",
                "frase idiotas",
        };
        ArrayList<String> frases = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            frases.add("Frase " + i);
        }

        int x = new Random().nextInt(frases.size());

        TextView texto = findViewById(R.id.fraseDia);
        texto.setText(frases.get(x));



    }

}
package com.example.classes_metodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Casa minhaCasa = new Casa();
        minhaCasa.cor = "Cor Exemplo";

        Casa suaCasa = new Casa();
        suaCasa.cor = "Vermelho";

        System.out.println(minhaCasa.cor);
    }
}
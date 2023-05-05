package com.example.intentapp

/*
    As intenções em kotlin podem ser dividas em duas, intenções explicitas e implicitas.
    As intenções explicitas são usadas quando queremos que algo seja feito pelo usuario, como
    por exemplo navegar entre telas do app por um botão.
*/

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.button)
        val tv : TextView = findViewById(R.id.textView)

        btn.setOnClickListener {
            // definindo uma intencao, passando o meu pacote de contexto e em seguida a classe
            val i = Intent(this, Activity2::class.java)
            // agora definimos um startActivity que recebe um intent como parametro e quando clicarmos no botao
            // passando dados entre activitis
            // podemos passar dados entre nossas activitis com o putExtra, onde passamos a chave e o valor dos nossos dados
            i.putExtra("age", 23)
            // seguiremos para a nossa screen MainActivity2 usando a intencao explicita
            startActivity(i)
        }
    }
}
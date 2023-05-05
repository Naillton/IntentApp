package com.example.intentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        // aqui recuperamos os dados passados pela nossa activity principal
        // criamos uma constante que recebe um tipo Bundle que recebe o valor da nossa intenção
        // OBS usamos o intent.extras para acessar os valores passados
        val bundle: Bundle? = intent.extras
        val value = bundle?.get("age")

        Toast.makeText(
            this@Activity2,
            "chave age, valor: "+value,
            Toast.LENGTH_LONG
        ).show()
    }
}
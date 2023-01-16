package com.daiane.aplicativorobo

import MarcianoAvancado
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var mensagem = findViewById<EditText>(R.id.textoEnviado)
        var botaoEnviar = findViewById<Button>(R.id.button_first)
        botaoEnviar.setOnClickListener(
            View.OnClickListener {
                exibeMensagem(mensagem.text.toString())
            })



    }
    fun exibeMensagem(mensagem: String) {
        var intent = Intent(this,RespostaActivity::class.java)
        var marciano = MarcianoAvancado()
        intent.putExtra("resposta", marciano.responda(mensagem))
        startActivity(intent)

    }

}
package com.rw.leandro.sorteio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View){

        var texto = findViewById<TextView>(R.id.textoSorteio)

        var numeroSorteado = Random().nextInt(11)

        texto.setText("Numero sorteado é: $numeroSorteado ")

    }
}

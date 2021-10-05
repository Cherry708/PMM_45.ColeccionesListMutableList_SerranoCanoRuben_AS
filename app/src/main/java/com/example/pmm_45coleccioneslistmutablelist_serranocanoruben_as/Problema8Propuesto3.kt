package com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as.databinding.ActivityProblema8Propuesto3Binding
import kotlin.random.Random

class Problema8Propuesto3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema8_propuesto3)

        val binding = ActivityProblema8Propuesto3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaAlturas = List(4){ Random.nextDouble(1.5,1.9)}
        val media = listaAlturas.average()
        val contadorBajo = listaAlturas.count(){it < media}
        val contadorAlto = listaAlturas.count(){it > media}

        var alturas = ""
        for (altura in listaAlturas){
            alturas += "$altura \n"
        }

        val mensajeAltura = "Las alturas son:\n$alturas\n"
        val mensajeMedia = "La altura media es $media\n"
        val mensajeContadorBajo = "Las alturas por debajo de la media son $contadorBajo\n"
        val mensajeContadorAlto = "Las alturas por encima de la media son $contadorAlto\n"

        binding.tvResultado80.text = mensajeAltura.plus(mensajeMedia)
            .plus(mensajeContadorBajo)
            .plus(mensajeContadorAlto)
    }
}
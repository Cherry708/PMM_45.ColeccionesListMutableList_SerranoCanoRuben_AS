package com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as.databinding.ActivityProblema6Propuesto1Binding

class Problema6Propuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema6_propuesto1)

        val binding = ActivityProblema6Propuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEnteros = MutableList(10){(0..20).random()}
        val listaEnterosTemporal = listaEnteros.toMutableList()

        var contador0 = listaEnteros.count(){it in 1..4}
        var contador1 = listaEnteros.count(){it in 5..8}
        var contador2 = listaEnteros.count(){it in 10..13}

        val mensajeLista = "Esta es la lista de enteros: $listaEnteros \n"
        val mensaje0 = "Numeros comprendidos entre 1 y 4: $contador0 \n"
        val mensaje1 = "Numeros comprendidos entre 5 y 8: $contador1 \n"
        val mensaje2 = "Numeros comprendidos entre 10 y 13: $contador2 \n"

        listaEnterosTemporal.removeAll(){it == 20}
        val contenidoListaTemporal = "Esta es la lista sin el número 20: $listaEnterosTemporal \n"

        binding.tvResultado60.text = mensajeLista.plus(mensaje0)
            .plus(mensaje1)
            .plus(mensaje2)
            .plus(contenidoListaTemporal)


    }
}
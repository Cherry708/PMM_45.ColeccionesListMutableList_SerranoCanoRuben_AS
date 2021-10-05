package com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as.databinding.ActivityProblema4Binding

class Problema4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema4)

        val binding = ActivityProblema4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEnteros = MutableList(20){(1..6).random()}
        val contenidoLista = "El contenido de la lista es: $listaEnteros \n"
        var contadorUnos = listaEnteros.count(){it == 1}
        val cantidadUnos = "La cantidad de 1 en la lista es de: $contadorUnos \n"
        listaEnteros.removeAll(){it == 6}
        val listaModificada = "La lista sin el número 6 es: $listaEnteros \n"

        binding.tvResultado40.text = contenidoLista.plus(cantidadUnos)
            .plus(listaModificada)
    }
}
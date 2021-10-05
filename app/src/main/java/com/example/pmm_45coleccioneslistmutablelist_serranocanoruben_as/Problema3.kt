package com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as.databinding.ActivityProblema3Binding

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)

        val binding = ActivityProblema3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEdades = mutableListOf<Int>(21,28,36,44,52)

        val edades = "Lista de edades: "+listaEdades.toString()+"\n"
        val primeraEdad = "Primera edad: ${listaEdades[0]}"+"\n"
        val edadPromedio = "Edad promedio: ${listaEdades.average()}"+"\n"
        val asignarOtraEdad = "Nueva edad asignada ${listaEdades.add(61)}"+"\n"
        listaEdades.add(0,19)
        val asignamosEdadInicio = "Nueva edad al principio de la lista: $listaEdades\n"

        binding.tvResultado.text = edades.plus(primeraEdad)
            .plus(edadPromedio)
            .plus(asignarOtraEdad)
            .plus(asignamosEdadInicio)
    }
}
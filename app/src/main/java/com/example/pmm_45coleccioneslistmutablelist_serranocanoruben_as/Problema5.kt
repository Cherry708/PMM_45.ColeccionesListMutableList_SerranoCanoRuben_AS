package com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as.databinding.ActivityProblema5Binding

class Problema5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema5)

        val binding = ActivityProblema5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaPersonas = mutableListOf(
            Persona("Ruben", 19),
            Persona("Juan", 20),
            Persona("Alberto", 17),
            Persona("Jorge", 19)
        )
        val listaPersonasTemporal = listaPersonas.toMutableList()


        val mostrarPersonas = "Las personas en la lista son: $listaPersonas \n"

        listaPersonasTemporal.removeAll() { persona -> !persona.esMayorDeEdad() }
        val personasMayores = "La lista de personas mayores de edad es: $listaPersonasTemporal \n"

        val mostrarPersonas2 = "Las personas en la lista son: $listaPersonas \n"



        binding.tvResultado50.text = mostrarPersonas.plus(personasMayores).plus(mostrarPersonas2)


    }
}

class Persona(var nombre: String, var edad: Int){
    fun esMayorDeEdad():Boolean{
        return this.edad >= 18
    }

    override fun toString(): String {
        return "$nombre, $edad años"
    }
}
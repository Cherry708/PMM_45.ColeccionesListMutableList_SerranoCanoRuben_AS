package com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as.databinding.ActivityProblema7Propuesto1Binding

class Problema7Propuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema7_propuesto1)

        val binding = ActivityProblema7Propuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEmpleados = mutableListOf(
            Empleado("Juan", 1200.0),
            Empleado("Alberto", 1300.0),
            Empleado("Berto", 1400.0)
        )

        var mostrarEmpleados = ""
        for(empleado in listaEmpleados){
            mostrarEmpleados +="$empleado. \n"
        }

        val mostrarLista = "Esta es la lista de empleados:\n$mostrarEmpleados \n"

        val salarios = listaEmpleados.sumOf { it.sueldo }
        val mostrarSalarios = "Este es el coste total de los salarios: $salarios \n"

        binding.tvResultado70.text = mostrarLista.plus(mostrarSalarios)
    }
}
class Empleado(var nombre: String, var sueldo: Double) {
    override fun toString(): String {
         return "Empleado $nombre, sueldo $sueldo"
    }
}

package com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_45coleccioneslistmutablelist_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaDiasSemana = listOf<String>("Lunes", "Martes",
            "Miercoles", "Jueves",
            "Viernes", "Sabado", "Domingo")

        val listaCompleta = listaDiasSemana.toString()+"\n"
        val primerDia = "Primer dia de la semana: ${listaDiasSemana[0]}"+"\n"
        val ultimoDia = "Ultimo dia de la semana: ${listaDiasSemana.last()}"+"\n"
        val cantidadDias = "La semana tiene ${listaDiasSemana.size} dias"+"\n"
        var diaPosicion = ""
        for (i in listaDiasSemana.indices){
            diaPosicion += "${i+1} .- ${listaDiasSemana[i]}."+"\n"
        }

        binding.tvResultado10.text = listaCompleta.plus(primerDia)
            .plus(ultimoDia)
            .plus(cantidadDias)
            .plus(diaPosicion)
    }
}
package com.example.tres_actividades

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad2)
        val intento= this.intent


        var mensajeDeMain = (intento.getStringExtra("MensajePara2"))
        Toast.makeText(applicationContext, mensajeDeMain, Toast.LENGTH_SHORT).show()

        val intentoResultado= Intent()
        intentoResultado.putExtra("DATORETURN","Este es el dato de la actividad 2")
        setResult(Activity.RESULT_OK,intentoResultado)
        finish()}



    }










package com.example.tres_actividades

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain)

        val openPostActivity =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult())
            { result ->
                if (result.resultCode == Activity.RESULT_OK) {
                    Toast.makeText(
                        applicationContext,
                        result.data?.getStringExtra("DATORETURN"),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }


        findViewById<Button>(R.id.boton1).setOnClickListener(
            View.OnClickListener {
                openPostActivity.launch(
                    Intent(applicationContext, Actividad1::class.java).apply
                    {putExtra("MensajePara1", "Este es el valor que se manda desde Main Activity")})
            })


        findViewById<Button>(R.id.boton2).setOnClickListener(
            View.OnClickListener {
                openPostActivity.launch(
                    Intent(applicationContext, Actividad2::class.java).apply
                    {putExtra("MensajePara2", "Este es el valor que se manda desde Main Activity")})
            })
    }
}




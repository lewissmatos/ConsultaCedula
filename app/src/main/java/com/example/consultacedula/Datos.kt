package com.example.consultacedula

import Cedulas
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Datos : AppCompatActivity(), View.OnClickListener{

    private var opdialog: AlertDialog.Builder? = null
    private val cedulas: Cedulas? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        val consOtra = findViewById<Button>(R.id.btnConsOtra)
        val image = findViewById<ImageView>(R.id.imgUser)
        val nombreCompleto = findViewById<TextView>(R.id.txtNombreC)
        val cedula = findViewById<TextView>(R.id.txtCedula)
        val fecha = findViewById<TextView>(R.id.txtFecha)
        val lugar = findViewById<TextView>(R.id.txtLugar)

        val pApell = cedulas?.getpApell()
        val sApell = cedulas?.getsApell()
        val cApell = pApell + sApell

        val nombres = cedulas?.getNombres().toString()

        cedula.text  = cedulas?.getnCedula().toString()
        fecha.text  = cedulas?.getFecha().toString()
        lugar.text  = cedulas?.getLugar().toString()

        nombreCompleto.text = cApell + nombres

        consOtra.setOnClickListener {

            opdialog = AlertDialog.Builder(this, R.style.DialogBasicCustomPrimaryColor)
                .setMessage("¿Seguro que desea salir?")
                .setPositiveButton("Aceptar",
                    DialogInterface.OnClickListener { dialog, which ->
                        startActivity(Intent(this@Datos, MainActivity::class.java))
                        finish()
                    }).setNegativeButton("Cancelar",
                    DialogInterface.OnClickListener { dialog, which -> })
            opdialog!!.create()
            opdialog!!.show()
        }

    }

    override fun onClick(v: View?) {

    }
}

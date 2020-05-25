package com.example.consultacedula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Cedula = findViewById<EditText>(R.id.edCedula)

        val Confirmar = findViewById<Button>(R.id.btnConfirmar)
        Confirmar.setOnClickListener {
               var cdl = Cedula.text
            if(cdl.isEmpty()){
                val t = Toast.makeText(this, "Debe llenar el campo", Toast.LENGTH_LONG)
                t.show()
            }
            else if (cdl.length <= 10){
                val t = Toast.makeText(this, "Su numero de cédula debe tener 11 dígigos", Toast.LENGTH_LONG)
                t.show()
            }
            else{
                val i = Intent (this, Datos::class.java)
                startActivity(i)
                finish()
            }
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}

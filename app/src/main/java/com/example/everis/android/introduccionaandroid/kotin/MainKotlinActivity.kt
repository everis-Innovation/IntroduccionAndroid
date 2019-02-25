package com.example.everis.android.introduccionaandroid.kotin

import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.everis.android.introduccionaandroid.AnotherActivity
import com.example.everis.android.introduccionaandroid.R

import kotlinx.android.synthetic.main.activity_main_kotlin.*

class MainKotlinActivity : Activity() {

    val PARAM_TEXT = "paramText"
    val PARAM_INT = "paramInt"
    val PARAM_BOOL = "ParamBool"

    private val TAG = "MainActivity"

    /*
    Este método se llama una sola vez por instancia, cada vez que se crea la pantalla.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(TAG, "onCreate")

        button!!.setOnClickListener {
            text_center!!.setText(R.string.text_center_alt)
            imageView!!.setImageResource(R.drawable.if_food_c240_2427880)
        }

        button_nextScreen!!.setOnClickListener {

            val intent = Intent(this@MainKotlinActivity, AnotherKotlinActivity::class.java)
            intent.putExtra(PARAM_TEXT, "Texto en parametro")
            intent.putExtra(PARAM_INT, 239)
            intent.putExtra(PARAM_BOOL, true)
            startActivity(intent)

        }

        //Intent explícito
        val explicitIntent = Intent(this, AnotherKotlinActivity::class.java)
        startActivity(explicitIntent)

        //Intent implícito
        val implicitIntent = Intent(Intent.ACTION_SEND)
        startActivity(implicitIntent)


    }

    /*
    Este método se llama cada vez que la pantalla se va a mostrar al usuario.
     */
    override fun onStart() {
        super.onStart()
        Log.v(TAG, "onStart")
    }

    /*
    Este método se llama cada vez que la pantalla va a empezar a recibir interacción por parte del usuario.
     */
    override fun onResume() {
        super.onResume()
        Log.v(TAG, "onResume")
    }

    /*
    Este método se llama cada vez que la pantalla deja de estar visible.
     */
    override fun onPause() {
        super.onPause()
        Log.v(TAG, "onPause")
    }

    /*
    Este método se llama cada vez que la instancia vuelve a iniciarse tras haberse llamado a onPause.
     */
    override fun onRestart() {
        super.onRestart()
        Log.v(TAG, "onRestart")
    }

    /*
    Este método se llama una sola vez por instancia, cuando el sistema destruye la Activity. Puede no llamarse.
     */
    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "onDestroy")
    }

}

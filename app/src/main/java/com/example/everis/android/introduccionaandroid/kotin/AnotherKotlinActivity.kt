package com.example.everis.android.introduccionaandroid.kotin

import android.os.Bundle
import android.app.Activity
import android.widget.TextView
import com.example.everis.android.introduccionaandroid.MainActivity
import com.example.everis.android.introduccionaandroid.R

import kotlinx.android.synthetic.main.activity_another_kotlin.*

class AnotherKotlinActivity : Activity() {

    private var mText: String? = null
    private var mNumber: Int = 0
    private var mBoolean: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        mText = intent.getStringExtra(MainActivity.PARAM_TEXT)
        mNumber = intent.getIntExtra(MainActivity.PARAM_INT, 0)
        mBoolean = intent.getBooleanExtra(MainActivity.PARAM_BOOL, false)

        //O también de esta forma

        val data = intent.extras
        mText = data!!.getString(MainActivity.PARAM_TEXT)
        mNumber = data.getInt(MainActivity.PARAM_INT, 0)
        mBoolean = data.getBoolean(MainActivity.PARAM_BOOL, false)

        text_center!!.text = "Texto: $text_center -- Numero: $mNumber -- Boolean: $mBoolean"
    }

}

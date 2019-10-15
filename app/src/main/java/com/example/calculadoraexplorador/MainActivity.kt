package com.example.calculadoraexplorador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    internal var bt0: Button?= null
    internal var bt1: Button?= null
    internal var bt2: Button?= null
    internal var bt3: Button?= null
    internal var bt4: Button?= null
    internal var bt5: Button?= null
    internal var bt6: Button?= null
    internal var bt7: Button?= null
    internal var bt8: Button?= null
    internal var bt9: Button?= null
    internal var btsum: Button?= null
    internal var btres: Button?= null
    internal var btdiv: Button?= null
    internal var btmul: Button?= null
    internal var btigual: Button?= null
    internal var btborrar: Button?= null
    internal var btpunto: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

package com.demo.androidarchitecturecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var textCounter: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        textCounter = findViewById(R.id.text_view)
        lifecycle.addObserver(Observer(context = this))
        Toast.makeText(this, "Activity - OnCreate", Toast.LENGTH_SHORT).show()
        setText()
    }

    private fun setText(){
        textCounter.text = mainViewModel.counter.toString()
    }

    fun increment() {
        mainViewModel.increment()
        setText()
    }
}
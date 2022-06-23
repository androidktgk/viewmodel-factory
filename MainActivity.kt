package com.govind8061.simplesimple

import android.content.ContentValues
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel:MainViewModel
    var tvShowCount:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel=ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)


        findViewById<Button>(R.id.btnIncrement)
            .setOnClickListener {
                increment()
                setText()
            }
        tvShowCount=findViewById(R.id.tvShowData)
        setText()
    }

    fun increment(){
        mainViewModel.increment()
    }
    fun setText(){
        tvShowCount?.text=mainViewModel.counter.toString()
    }

}
package com.govind8061.simplesimple

import androidx.lifecycle.ViewModel

class MainViewModel(initialInt: Int): ViewModel() {
    var counter=initialInt

    fun increment(){
        counter++
    }

}
package com.demo.androidarchitecturecomponent

import androidx.lifecycle.ViewModel

/**
 ViewModel is a model which is used for only storing the data.
 It doesn't has any reference with the View
 */
class MainViewModel : ViewModel() {
    var counter: Int = 0

    fun increment() {
        counter++;
    }
}
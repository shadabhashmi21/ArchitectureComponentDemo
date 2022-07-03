package com.demo.androidarchitecturecomponent

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.*

class Observer(private val context: Context): DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        Toast.makeText(context, "Observer - OnCreate", Toast.LENGTH_SHORT).show()
        super.onCreate(owner)
    }

    override fun onStart(owner: LifecycleOwner) {
        Toast.makeText(context, "Observer - OnStart", Toast.LENGTH_SHORT).show()
        super.onStart(owner)
    }

    override fun onResume(owner: LifecycleOwner) {
        Toast.makeText(context, "Observer - OnResume", Toast.LENGTH_SHORT).show()
        super.onResume(owner)
    }

    override fun onPause(owner: LifecycleOwner) {
        Toast.makeText(context, "Observer - OnPause", Toast.LENGTH_SHORT).show()
        super.onPause(owner)
    }

    override fun onStop(owner: LifecycleOwner) {
        Toast.makeText(context, "Observer - OnStop", Toast.LENGTH_SHORT).show()
        super.onStop(owner)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Toast.makeText(context, "Observer - OnDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy(owner)
    }
}
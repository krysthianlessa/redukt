package com.github.oxeanbits.redukt.ui

import androidx.appcompat.app.AppCompatActivity
import com.github.oxeanbits.redukt.Redukt
import com.github.oxeanbits.redukt.states.StateListener

abstract class ReactiveActivity<T> : AppCompatActivity(), StateListener<T> {

    protected abstract fun getRedukt(): Redukt<T>

    override fun onStart() {
        super.onStart()

        getRedukt().listeners.add(this)
        onChanged(getRedukt().state)
    }

    override fun onStop() {
        getRedukt().listeners.remove(this)
        super.onStop()
    }

    override fun hasChanged(newState: T, oldState: T): Boolean = newState != oldState
}
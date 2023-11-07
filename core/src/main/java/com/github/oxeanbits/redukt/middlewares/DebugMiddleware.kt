package com.github.oxeanbits.redukt.middlewares

import com.github.oxeanbits.redukt.actions.Action
import com.github.oxeanbits.redukt.debug
import com.github.oxeanbits.redukt.states.StateListener

class DebugMiddleware<T> : Middleware<T>, StateListener<T> {
    override fun before(state: T, action: Action<*>) {
        debug("<Redukt> has start [${action.name}]")
    }

    override fun after(state: T, action: Action<*>) {
        //Do nothing
    }

    override fun onChanged(state: T) {
        debug("<Redukt> state was changed!")
    }

    override fun hasChanged(newState: T, oldState: T): Boolean {
        return if (newState == oldState) {
            debug("<Redukt> state wasn't changed!")
            false
        } else {
            true
        }
    }
}
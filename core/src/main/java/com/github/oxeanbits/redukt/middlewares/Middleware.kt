package com.github.oxeanbits.redukt.middlewares

import com.github.oxeanbits.redukt.actions.Action

interface Middleware<in State> {

    fun before(state: State, action: Action<*>)

    fun after(state: State, action: Action<*>)
}
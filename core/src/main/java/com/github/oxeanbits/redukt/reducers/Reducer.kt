package com.github.oxeanbits.redukt.reducers

import com.github.oxeanbits.redukt.actions.Action

interface Reducer<T> {
    fun reduce(state: T, action: Action<*>): T
}

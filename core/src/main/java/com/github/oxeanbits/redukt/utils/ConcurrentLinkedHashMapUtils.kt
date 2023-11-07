package com.github.oxeanbits.redukt.utils

import com.googlecode.concurrentlinkedhashmap.ConcurrentLinkedHashMap

fun <T> createLinkedMap(): ConcurrentLinkedHashMap<String, T> {
    return ConcurrentLinkedHashMap
            .Builder<String, T>()
            .maximumWeightedCapacity(1000)
            .build()
}
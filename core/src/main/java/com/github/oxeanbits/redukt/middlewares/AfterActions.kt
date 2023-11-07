package com.github.oxeanbits.redukt.middlewares

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class AfterActions(val filter: Array<String> = [])
package com.github.oxeanbits.redukt.middlewares

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class BeforeAction(val action: String)

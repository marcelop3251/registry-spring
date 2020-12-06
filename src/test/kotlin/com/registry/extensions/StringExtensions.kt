package com.registry.extensions

fun String.payload() : String =
        javaClass.getResource("/payloads/$this").readText()
package com.burak.noteapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
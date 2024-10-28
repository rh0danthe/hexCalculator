package io.interfaces

interface IO {
    fun read() : List<String>
    fun write(content: List<String>)
}
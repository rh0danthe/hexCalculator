package io

import io.interfaces.IO

class ConsoleIO : IO {
    override fun read(): List<String> {
        println("Введите выражения: ")
        val inputs = mutableListOf<String>()
        while (true) {
            val input = readlnOrNull() ?: ""

            if (input.lowercase() == "stop") {
                break
            }

            inputs.add(input)
        }
        return inputs
    }

    override fun write(content: List<String>) {
        println("Выражения в шестнадцатеричной системе счисления: ")
        for (elem in content){
            println(elem)
        }
    }
}
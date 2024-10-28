package io

import io.interfaces.IO

class ConsoleIO : IO {
    override fun read(): String {
        println("Введите выражение: ")
        return readlnOrNull() ?: throw Exception("Неверное выражение")
    }

    override fun write(content: String) {
        print("Выражение в шестнадцатеричной системе счисления: $content")
    }
}
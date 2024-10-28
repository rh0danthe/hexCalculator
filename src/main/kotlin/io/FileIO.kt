package io

import io.interfaces.IO
import java.io.File

class FileIO(private val path: String) : IO {
    override fun read(): List<String> {
        return File(path).readLines()
    }

    override fun write(content: List<String>) {
        File(path).appendText("Выражения в шестнадцатеричной системе счисления:\n")
        for (elem in content){
            File(path).appendText("$elem\n")
        }
        println("Результат был записан в файл $path")
    }
}
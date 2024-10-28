package io

import io.interfaces.IO
import java.io.File

class FileIO(private val path: String) : IO {
    override fun read(): String {
        return File(path).readText()
    }

    override fun write(content: String) {
        File(path).writeText(content)
        println("Результат был записан в файл $path")
    }
}
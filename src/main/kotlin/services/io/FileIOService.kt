package services.io

import io.FileIO
import utils.Calculator
import utils.Validator

class FileIOService(path: String) {
    private val IO = FileIO(path)
    private val validator = Validator()
    private val calculator = Calculator()

    fun execute(){
        val expression = IO.read()
        val parts = validator.validateExpression(expression)
        val result = calculator.calculate(parts)
        IO.write(result)
    }
}
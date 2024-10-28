package services

import io.interfaces.IO
import utils.Calculator
import utils.Validator

class IOService(private val io: IO) {
    private val validator = Validator()
    private val calculator = Calculator()

    fun execute(){
        val expression = io.read()
        val parts = validator.validateExpression(expression)
        val result = calculator.calculate(parts)
        io.write(result)
    }
}
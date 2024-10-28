package services

import io.interfaces.IO
import utils.Calculator
import utils.Validator

class CalculateService(private val io: IO) {
    private val validator = Validator()
    private val calculator = Calculator()

    fun execute(){
        val expressions = io.read()
        val parts = validator.validateExpression(expressions)
        val result = calculator.calculate(parts)
        io.write(result)
    }
}
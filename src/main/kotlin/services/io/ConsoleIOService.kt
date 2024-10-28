package services.io

import io.ConsoleIO
import utils.Calculator
import utils.Validator

class ConsoleIOService{
    private val IO = ConsoleIO()
    private val validator = Validator()
    private val calculator = Calculator()

    fun execute(){
        val expression = IO.read()
        val parts = validator.validateExpression(expression)
        val result = calculator.calculate(parts)
        IO.write(result)
    }
}
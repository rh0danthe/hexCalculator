package utils

class Calculator() {

    fun calculate(expressions: List<List<String>>): List<String>{
        return expressions.map { expression ->
            if (expression.count() == 1) expression[0]
            else if (expression.count() == 3) {
                val firstValue = expression[0].toLong()
                val secondValue = expression[2].toLong()
                when (expression[1]) {
                    "+" -> (firstValue + secondValue).toHex()
                    "-" -> (firstValue - secondValue).toHex()
                    "/" -> (firstValue / secondValue).toHex()
                    "*" -> (firstValue * secondValue).toHex()
                    else -> throw Exception("Ошибка при вычислении")
                }
            }
            else throw Exception("Ошибка при вычислении")
        }
    }

    private fun Long.toHex(): String {
        return this.toString(16).padStart(2, '0')
    }
}
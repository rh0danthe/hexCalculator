package utils

class Calculator() {

    fun calculate(parts: List<String>): String{
        val firstValue = parts[0].toLong()
        val secondValue = parts[2].toLong()
        return when(parts[1]){
            "+" -> (firstValue + secondValue).toHex()
            "-" -> (firstValue - secondValue).toHex()
            "/" -> (firstValue / secondValue).toHex()
            "*" -> (firstValue * secondValue).toHex()
            else -> throw Exception("Неверное выражение")
        }
    }

    private fun Long.toHex(): String {
        return this.toString(16).padStart(2, '0')
    }
}
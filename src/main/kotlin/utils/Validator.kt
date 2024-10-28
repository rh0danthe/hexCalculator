package utils

class Validator {
    fun validateExpression(expressions: List<String>): List<List<String>> {
        return expressions.map { expression ->
            val regex = """^\s*\d+\s*[\+\-\*/]\s*\d+\s*$""".toRegex()

            if (regex.matches(expression.trim())) {
                val parts = """\d+|[\+\-\*/]""".toRegex()
                    .findAll(expression.replace(" ", ""))
                    .map { it.value }
                    .toList()
                parts
            } else {
                listOf("Неверный формат выражения")
            }
        }
    }


    fun validatePath(path: String): Boolean{
        val regex = """^([a-zA-Z]:\\([^<>:"/\\|?*\r\n]+\\)*([^<>:"/\\|?*\r\n]+)?|\\\\([^<>:"/\\|?*\r\n]+\\)*([^<>:"/\\|?*\r\n]+)?|[a-zA-Z0-9._-]+(\\|/)[^<>:"/\\|?*\r\n]+)$""".toRegex()
        return regex.matches(path)
    }

}
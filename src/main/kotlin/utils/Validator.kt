package utils

class Validator {
    fun validateExpression(expression: String): List<String> {
        val regex = """\d+(\s*[\+\-\*/]\s*\d+)+""".toRegex()
        if (regex.matches(expression.trim())) {
            return """\d+|[\+\-\*/]""".toRegex()
                .findAll(expression.replace(" ", ""))
                .map { it.value }
                .toList()
        } else {
            throw Exception("Неверный формат выражения")
        }
    }

    fun validatePath(path: String): Boolean{
        val regex = """^([a-zA-Z]:\\([^<>:"/\\|?*\r\n]+\\)*([^<>:"/\\|?*\r\n]+)?|\\\\([^<>:"/\\|?*\r\n]+\\)*([^<>:"/\\|?*\r\n]+)?|[a-zA-Z0-9._-]+(\\|/)[^<>:"/\\|?*\r\n]+)$""".toRegex()
        return regex.matches(path)
    }


}
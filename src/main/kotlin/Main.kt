import services.io.ConsoleIOService
import services.io.FileIOService
import utils.Validator

fun main(args: Array<String>) {
    try{
        if (args.isEmpty()) {
            val consoleIOService = ConsoleIOService()
            consoleIOService.execute()
            return
        }
        val validator = Validator()
        val path = args[0]
        if (!validator.validatePath(path)) throw Exception("Неверный путь")
        val fileIOService = FileIOService(path)
        fileIOService.execute()
    }
    catch(e: Exception){
        println(e.message)
    }
}

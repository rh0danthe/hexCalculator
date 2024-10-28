import io.ConsoleIO
import io.FileIO
import services.IOService
import utils.Validator

fun main(args: Array<String>) {
    try{
        if (args.isEmpty()) {
            val io = ConsoleIO()
            val service = IOService(io)
            service.execute()
            return
        }
        val validator = Validator()
        val path = args[0]
        if (!validator.validatePath(path)) throw Exception("Неверный путь")
        val io = FileIO(path)
        val service = IOService(io)
        service.execute()
    }
    catch(e: Exception){
        println(e.message)
    }
}

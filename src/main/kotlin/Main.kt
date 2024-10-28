import io.ConsoleIO
import io.FileIO
import services.CalculateService
import utils.Validator

fun main(args: Array<String>) {
    try{
        if (args.isEmpty()) {
            calculateFromConsole()
            return
        }
        calculateFromFile(args[0])
    }
    catch(e: Exception){
        println(e.message)
    }

}

fun calculateFromConsole(){
    val io = ConsoleIO()
    val service = CalculateService(io)
    service.execute()
}

fun calculateFromFile(path: String){
    val validator = Validator()
    if (!validator.validatePath(path)) throw Exception("Неверный путь")
    val io = FileIO(path)
    val service = CalculateService(io)
    service.execute()
}

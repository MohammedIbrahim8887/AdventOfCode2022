import java.io.File
import kotlin.time.Duration.Companion.seconds

fun main() {
    val filename = "src\\Sample_data.txt"
    val readInput = File(filename).readLines()

    var cal = mutableListOf<Int>()
    var noElf = -1
    var calOfElf = 0
    for(line in readInput) {
        if (line != "") {
            calOfElf += line.toInt()
        }
        else  {
            noElf++
            cal.add(calOfElf)
            calOfElf = 0
        }
    }
        val sorted = cal.sorted().reversed().toMutableList()
        println(sorted)
        println(sorted[0]+sorted[1]+sorted[2])


    }



import java.io.File
fun main(args: Array<String>) {
    val filename = ("src\\inputfile.txt")
    val readInput = File(filename).readLines().toMutableList()
    var totalScore = 0
    var i = 0
   readInput.forEach{
        val game = readInput[i].toString().split(" ").toMutableList()
       if(game[0] == "A" && game[1] == "X")
           totalScore += 0 + 3
       else if(game[0] == "A" && game[1] == "Y")
           totalScore += 1 + 3
       else if(game[0] == "A" && game[1] == "Z")
           totalScore += 2 + 6
       else if(game[0] == "B" && game[1] == "X")
           totalScore += 1 + 0
       else if(game[0] == "B" && game[1] == "Y")
           totalScore += 2 + 3
       else if(game[0] == "B" && game[1] == "Z")
           totalScore += 3 + 6
       else if(game[0] == "C" && game[1] == "X")
           totalScore += 2 + 0
       else if(game[0] == "C" && game[1] == "Y")
           totalScore += 3 + 3
       else if(game[0] == "C" && game[1] == "Z")
           totalScore += 1 + 6
    i++
   }
    println(totalScore)
}

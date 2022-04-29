
fun main(args: Array<String>) {

    when (args[0].toInt()) {
        1 -> println(ProblemOne().sumOfMultiplesOfThreeAndFive())
        2 -> println(ProblemTwo().driver())
        3 -> println(ProblemThree().driver())
        4 -> println(ProblemFour().driver())
        5 -> println(ProblemFive().driver(20))
        6 -> println(ProblemSix().driver(100))
    }
}
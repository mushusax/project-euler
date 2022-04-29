import kotlin.math.pow

/*
The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

class ProblemSix {
    fun driver(num: Int): Int {
        return squareOfSum(num) - sumOfSquares(num)
    }

    fun sumOfSquares(num: Int): Int = (1..num).reduce { acc, i -> acc + i*i }
    fun squareOfSum(num: Int): Int = (1..num).sum().toDouble().pow(2).toInt()
}
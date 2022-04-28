//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

class ProblemFive {
    fun driver(range: Int): Int {
        return (1 until Int.MAX_VALUE).find { num -> numberDivisibleInRange(num, range) } ?: 0
    }

    fun numberDivisibleInRange(number: Int, range: Int): Boolean {
        (1..range).forEach { i ->
            if (number.mod(i) != 0) {
                return false
            }
        }
        return true
    }
}
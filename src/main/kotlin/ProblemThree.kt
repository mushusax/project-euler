
//
//
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?


class ProblemThree {
    fun driver(): Long = 600851475143L.largestPrimeFactor()


    private fun primeFactors(num: Long): List<Long> {
        val factor: Long = (2 until num).find { num.mod(it) == 0L} ?: return listOf(num)
        return listOf(factor!!) + primeFactors(num.div(factor))
    }


    private fun Long.largestPrimeFactor(): Long {
        println(primeFactors(this))
        return primeFactors(this).last()
    }

}
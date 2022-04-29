class ProblemSeven {
    fun driver(num: Int): Int {
        var i = num
        var result = 1
        while (i-- > 0) {
            result = nextPrime(result) ?: break
        }
        return result
    }

    fun nextPrime(starting: Int): Int? = (starting+1..Int.MAX_VALUE).find { i -> isPrime(i) }

    fun isPrime(num: Int): Boolean {
        if(num == 1) return true
        else return (2 until num).find { i -> num.mod(i) == 0 } == null
    }
}
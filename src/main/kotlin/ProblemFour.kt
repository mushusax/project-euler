import java.lang.Integer.max

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

class ProblemFour {
    fun driver(): Int {
        var result = 0
        for (i in 999 downTo 100) {
            for (j in 999 downTo 100) {
                val num = i * j
                if(isPalindrome(num)) result = max(result, num)
            }
        }
        return result
    }

    private fun isPalindrome(num: Int): Boolean {
        val forward = num.toString()
        return forward == forward.reversed()
    }
}
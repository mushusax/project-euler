import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


internal class ProblemOneTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun sumOfMultiplesOfThreeAndFive() {
        val problemOne = ProblemOne()
        assert(problemOne.sumOfMultiplesOfThreeAndFive().equals(233168))
    }
}
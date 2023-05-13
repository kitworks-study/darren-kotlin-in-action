package study.kotlininactionsutdy.ch02

import ch02.FizzBuzz.fizzBuzz
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("[UnitTest] 코틀린 함수 FizzBuzz 테스트")
class FizzBuzzTest {

    @Test
    @DisplayName("3배수는 Fizz이다.")
    fun multiple_of_15_will_return_fizz() {
        assertThat(fizzBuzz(3)).isEqualTo("Fizz")
    }

    @Test
    @DisplayName("5배수는 Buzz이다.")
    fun multiple_of_5_will_return_buzz() {
        assertThat(fizzBuzz(5)).isEqualTo("Buzz")
    }

    @Test
    @DisplayName("15배수는 FizzBuzz이다.")
    fun multiple_of_15_will_return_fizzBuzz() {
        assertThat(fizzBuzz(15)).isEqualTo("FizzBuzz")
    }
}
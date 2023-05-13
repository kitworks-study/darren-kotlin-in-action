package study.kotlininactionsutdy.ch02

import ch02.TryAsExpression.readNumber
import ch02.TryCatch.isPercentage
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.StringReader

@DisplayName("[UnitTest] 코틀린 TryCatch 테스트")
class TryCatchTest {

    @Test
    @DisplayName("throwIllegalArgumentExceptionTest 테스트")
    fun throw_illegalArgumentException() {
        val value = 300
        assertThatThrownBy { isPercentage(value) }
            .isExactlyInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("A percentage value must be between 0 and 100: ${value}")
    }

    @Test
    @DisplayName("NumberFormatException이 발생할 경우 null을 리턴한다.")
    fun when_readNumber_success_returns_an_integer() {
        val reader = BufferedReader(StringReader("123"))
        assertThat(readNumber(reader))
            .isEqualTo(123)
    }

    @Test
    @DisplayName("NumberFormatException이 발생할 경우 null을 리턴한다.")
    fun when_NumberFormatException_returns_null() {
        val reader = BufferedReader(StringReader("not a number"))
        assertThat(readNumber(reader))
            .isNull()
    }
}
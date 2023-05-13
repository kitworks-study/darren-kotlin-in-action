package study.kotlininactionsutdy.ch02.test

import ch02.Function.max
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("[UnitTest] 코틀린 함수 테스트")
class FunctionTest {
    @Test
    @DisplayName("max()함수는 값이 더 큰 인자를 반환한다.")
    fun max_will_return_bigger_value_success() {
        assertThat(max(1,2))
            .isEqualTo(2)
    }

    @Test
    @DisplayName("max()함수는 값이 더 큰 인자를 반환한다.")
    fun max_will_return_bigger_value_fail() {
        assertThat(max(1,2))
            .isNotEqualTo(1)
    }
}
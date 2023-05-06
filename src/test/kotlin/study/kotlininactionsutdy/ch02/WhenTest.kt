package study.kotlininactionsutdy.ch02

import ch02.Enum.Color
import ch02.StringTemplate.complexStringTemplate
import ch02.StringTemplate.simpleStringTemplate
import ch02.When.getMnemonic
import ch02.When.getWarmth
import ch02.When.mix
import ch02.When.mixOptimized
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@DisplayName("[UnitTest] 코틀린 When 테스트")
class WhenTest {
    @Test
    @DisplayName("각 When 케이스를 검사한다.")
    fun test_each_when_case_of_getMnemonic() {
        fun localFunction (color: Color) = getMnemonic(color)

        assertThat(localFunction(Color.RED))
            .isEqualTo("Richard")
        assertThat(localFunction(Color.ORANGE))
            .isEqualTo("Of")
        assertThat(localFunction(Color.YELLOW))
            .isEqualTo("York")
        assertThat(localFunction(Color.GREEN))
            .isEqualTo("Gave")
        assertThat(localFunction(Color.BLUE))
            .isEqualTo("Battle")
        assertThat(localFunction(Color.INDIGO))
            .isEqualTo("In")
        assertThat(localFunction(Color.VIOLET))
            .isEqualTo("Vain")
    }

    @ParameterizedTest
    @DisplayName("각 When 케이스를 검사한다.")
    fun test_each_when_case_of_getWarmth() {
        fun localFunction (color: Color) = getWarmth(color)

        assertThat(localFunction(Color.RED))
            .isEqualTo("warm")
        assertThat(localFunction(Color.ORANGE))
            .isEqualTo("warm")
        assertThat(localFunction(Color.YELLOW))
            .isEqualTo("warm")

        assertThat(localFunction(Color.GREEN))
            .isEqualTo("neutral")

        assertThat(localFunction(Color.BLUE))
            .isEqualTo("cold")
        assertThat(localFunction(Color.INDIGO))
            .isEqualTo("cold")
        assertThat(localFunction(Color.VIOLET))
            .isEqualTo("cold")
    }

    @Test
    @DisplayName("각 When 케이스를 검사한다.")
    fun test_each_when_case_of_mix() {
        fun localFunction (c1: Color, c2: Color) = mix(c1, c2)

        assertThat(localFunction(Color.RED, Color.YELLOW))
            .isEqualTo(Color.ORANGE)
        assertThat(localFunction(Color.YELLOW, Color.RED))
            .isEqualTo(Color.ORANGE)

        assertThat(localFunction(Color.YELLOW, Color.BLUE))
            .isEqualTo(Color.GREEN)
        assertThat(localFunction(Color.BLUE, Color.YELLOW))
            .isEqualTo(Color.GREEN)

        assertThat(localFunction(Color.BLUE, Color.VIOLET))
            .isEqualTo(Color.INDIGO)
        assertThat(localFunction(Color.VIOLET, Color.BLUE))
            .isEqualTo(Color.INDIGO)

        assertThatThrownBy { localFunction(Color.RED, Color.VIOLET) }
            .isExactlyInstanceOf(Exception::class.java)
            .hasMessage("Dirty color")
    }

    @Test
    @DisplayName("mix()와 mixOptimized()의 리턴 값은 동일하다.")
    fun test_mix_and_mixOptimized_return_same_result() {

        assertThat(mix(Color.RED, Color.YELLOW))
            .isEqualTo(mixOptimized(Color.RED, Color.YELLOW))
        assertThat(mix(Color.RED, Color.YELLOW))
            .isEqualTo(mixOptimized(Color.YELLOW, Color.RED))

        assertThat(mix(Color.YELLOW, Color.BLUE))
            .isEqualTo(mixOptimized(Color.YELLOW, Color.BLUE))
        assertThat(mix(Color.YELLOW, Color.BLUE))
            .isEqualTo(mixOptimized(Color.BLUE, Color.YELLOW))

        assertThat(mix(Color.BLUE, Color.VIOLET))
            .isEqualTo(mixOptimized(Color.BLUE, Color.VIOLET))
        assertThat(mix(Color.BLUE, Color.VIOLET))
            .isEqualTo(mixOptimized(Color.VIOLET, Color.BLUE))

        assertThatThrownBy { mix(Color.RED, Color.VIOLET) }
            .isExactlyInstanceOf(Exception::class.java)
            .hasMessage("Dirty color")
    }
}
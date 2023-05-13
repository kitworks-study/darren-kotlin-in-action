package study.kotlininactionsutdy.ch02

import ch02.CheckElement.isLetter
import ch02.CheckElement.isNotDigit
import ch02.CheckElement.recognize
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("[UnitTest] 코틀린 In 테스트")
class CheckElementTest {

    @Test
    @DisplayName("a는 문자이다.")
    fun a_is_a_letter() {
        assertThat(isLetter('a'))
            .isEqualTo(true)
    }

    @Test
    @DisplayName("a는 정수가 아니다.")
    fun a_is_not_an_integer() {
        assertThat(isNotDigit('a'))
            .isEqualTo(true)
    }

    @Test
    @DisplayName("1은 정수이다.")
    fun one_is_an_integer() {
        assertThat(isNotDigit('1'))
            .isEqualTo(false)
    }

    @Test
    @DisplayName("1은 문자가 아니다.")
    fun one_is_not_a_letter() {
        assertThat(isLetter('1'))
            .isEqualTo(false)
    }

    @Test
    @DisplayName("1은 정수이다.")
    fun recognize_letter_A() {
        assertThat(recognize('1'))
            .isEqualTo("It's a digit!")
    }

    @Test
    @DisplayName("A는 문자이다.")
    fun recognize_one() {
        assertThat(recognize('A'))
            .isEqualTo("It's a letter!")
    }

    @Test
    @DisplayName("특수문자는 일반문자나 정수에 포함되지 않는다.")
    fun string_is_neither_a_letter_nor_an_integer() {
        assertThat(recognize('#'))
            .isEqualTo("I don't know...")
    }
}
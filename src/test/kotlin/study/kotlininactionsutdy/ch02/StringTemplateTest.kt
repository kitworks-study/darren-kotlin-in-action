package study.kotlininactionsutdy.ch02

import ch02.StringTemplate.complexStringTemplate
import ch02.StringTemplate.simpleStringTemplate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("[UnitTest] 코틀린 문자열 템플릿 테스트")
class StringTemplateTest {
    @Test
    @DisplayName("인자로 받은 문자열을 문자열 템플릿으로 반환한다.")
    fun argument_return_by_string_template() {
        assertThat(simpleStringTemplate(first = "Kotlin is fun", last = "!!!"))
            .isEqualTo("Kotlin is fun!!!")
    }

    @Test
    @DisplayName("복잡한 식을 지원한다.")
    fun string_template_can_use_complex_expression() {
        assertThat(complexStringTemplate(arrayOf("Nice to meet you")))
            .isEqualTo("Nice to meet you")
    }

    @Test
    @DisplayName("복잡한 식을 지원한다. empty 케이스")
    fun string_template_can_use_complex_expression_empty_case() {
        assertThat(complexStringTemplate(arrayOf()))
            .isEqualTo("empty")
    }
}
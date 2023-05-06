package study.kotlininactionsutdy.ch02

import ch02.Property.Person
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("[UnitTest] 코틀린 클래스 테스트")
class ClassTest {

    @Test
    @DisplayName("Person 클래스의 인스턴스를 생성한다")
    fun build_person_instance() {

        assertThat(Person(name = "김철수", isMarried = true))
            .isExactlyInstanceOf(Person::class.java)
    }

    @Test
    @DisplayName("Person 클래스의 속성(멤버변수)을 검사한다.")
    fun person_property_name() {
        val person = Person(name = "김철수", isMarried = true)

        assertThat(person)
            .extracting("isMarried")
            .isEqualTo(true)
    }
    @Test
    @DisplayName("Person 클래스의 속성(멤버변수)을 검사한다.")
    fun person_property_isMarried() {
        val person = Person(name = "김철수", isMarried = true)

        assertThat(person)
            .extracting("isMarried")
            .isEqualTo(true)
    }
}
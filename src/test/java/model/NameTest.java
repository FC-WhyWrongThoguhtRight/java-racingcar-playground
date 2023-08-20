package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class NameTest {

    @Test
    void 이름이Null이면오류인가() {
        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> {
                    Name name = new Name(null);
                }).withMessageMatching("name은 null이 아니어야 합니다.");
    }

    @Test
    void 이름이_1자이하면_오류인가(){
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    Name name = new Name("");
                }).withMessageMatching("이름은 1글자 이상 이어야 합니다.");
    }

    @Test
    void 이름이_5자이상이면_오류인가() {
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    Name name = new Name("asdfasdf");
                }).withMessageMatching("이름은 5글자 이하 이여야 합니다.");
    }
}

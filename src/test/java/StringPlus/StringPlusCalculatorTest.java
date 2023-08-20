package StringPlus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringPlusCalculatorTest {

    @Test
    void null_빈문자() {
        int result = StringPlusCalculator.splitAndSum(null);
        assertThat(result).isEqualTo(0);
        result = StringPlusCalculator.splitAndSum("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void string_문자가하나일때() {
        int result = StringPlusCalculator.splitAndSum("1");

        assertThat(result).isEqualTo(1);
    }

    @Test
    void split_기본구분자_sum() {
        int result = StringPlusCalculator.splitAndSum("1,2");
        assertThat(result).isEqualTo(3);

        result = StringPlusCalculator.splitAndSum("1:2");
        assertThat(result).isEqualTo(3);

        result = StringPlusCalculator.splitAndSum("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void split_커스텀문자_sum() {
        int result = StringPlusCalculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void throw_숫자아닐경우() {
        assertThatThrownBy(() -> StringPlusCalculator.splitAndSum("-"))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("0 또는 양의 정수만 계산 가능합니다.");

        assertThatThrownBy(() -> StringPlusCalculator.splitAndSum("a,1,b"))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("0 또는 양의 정수만 계산 가능합니다.");
    }
}

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.assertj.core.api.Assertions.assertThat;

public class SpringPlusTest {

    StringPlus sp;

    @BeforeEach
    void setUp(){
        sp = new StringPlus();
    }

    @Test
    void 빈문자열입력시0반환(){
        int actual = sp.plus("");
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void null입력시0반환(){
        int actual = sp.plus(null);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void 숫자하나를입력하면해당숫자반환(){
        int actual = sp.plus("1");
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void 숫자를컴마구분자로입력하면합을구함(){
        int actual = sp.plus("1,2");
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void 숫자를콜론을구분지로입력하면합을구합(){
        int actual = sp.plus("1:2");
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void 커스텀구분자를이용한합(){
        String s = "//;\n1;2;3;";
        int actual = sp.plus(s);
        assertThat(actual).isEqualTo(6);
    }

}

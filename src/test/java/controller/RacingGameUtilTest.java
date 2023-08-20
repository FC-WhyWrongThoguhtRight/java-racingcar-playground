package controller;

import model.Name;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class RacingGameUtilTest {

    @Test
    void 이름을나눠서리스트로반환하는가() {
        List<Name> nameList = RacingGameUtil.splitNames("qwer,asdf,zxcv");
        assertThat(nameList).contains(new Name("qwer"),new Name("asdf"), new Name("zxcv"));
    }
}

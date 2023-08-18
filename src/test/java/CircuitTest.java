import model.Cars;
import model.Circuit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CircuitTest {

    Circuit c;
    String names = "zxcv,asdf,qwer";
    int lap = 2;

    @BeforeEach
    void setup(){
        c = new Circuit(new Cars(names), lap);
    }

    @Test
    void 서킷은차량들을가지고있는가(){
        int size = c.getCars().size();
        assertThat(size).isGreaterThan(0);
    }

    @Test
    void 서킷에서차량이주행하는가(){
        c.drive();
        c.drive();
        c.drive();
        int loc = c.getCars().get(0).getLocation();
        assertThat(loc).isGreaterThan(0);
    }

    @Test
    void 서킷은Lap을가지고있는가(){
        int lap = c.getLap();
        assertThat(lap).isNotEqualTo(0);
    }


}

package workshops_hw.task1;

import static org.assertj.core.api.Assertions.*;
import static workshops_hw.task1.Calculator.calculatingDiscount;

public class CalculatorTest {
    public static void main(String[] args) {

        assertThat(calculatingDiscount(100,25)).isEqualTo(75);
        assertThatThrownBy(() -> calculatingDiscount(-150,0)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> calculatingDiscount(500,-50)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> calculatingDiscount(750,100)
        ).isInstanceOf(ArithmeticException.class);

        System.out.println(calculatingDiscount(1000, 25));
        System.out.println(calculatingDiscount(-150, 0));
        System.out.println(calculatingDiscount(500, -50));
        System.out.println(calculatingDiscount(750, 100));
    }
}

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

    CalculatorImpl calculator = new CalculatorImpl();

    @Test
    void testAddition() {
        System.out.println("Сложение ");
        assertEquals(calculator.addition(5,5), 10);
    }

    @Test
    void testSubtraction() {
        System.out.println("Вычитание");
        assertEquals(calculator.subtraction(5,5),0);
    }

    @Test
    void testMultiplication() {
        System.out.println("Умножение");
        assertEquals(calculator.multiplication(5,0),0);
    }

    @Test
    void tesDivision() {
        System.out.println("Деление");
        assertEquals(calculator.division(5, 5), 1);

    }
    @Test
    void testHamcrestKorocheGovorya() {
        int extected = 2;
        assertThat(calculator.division(10,5),is(extected));
    }

}
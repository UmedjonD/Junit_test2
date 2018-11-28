import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

    CalculatorImpl calculator = new CalculatorImpl();

    @Test
    void testAddition() {
        System.out.println("Сложение ");
        int a = 5;
        int b = 5;
        int expected = 10;
        int result = calculator.addition(a, b);
        assertEquals(expected,result);
    }

    @Test
    void testSubtraction() {
        System.out.println("Вычитание");
        int a = 5;
        int b = 5;
        int expected = 0;
        int result = calculator.subtraction(a, b);
        assertEquals(expected,result);
    }

    @Test
    void testMultiplication() {
        System.out.println("Умножение");
        int a = 5;
        int b = 0;
        int expected = 0;
        int result = calculator.multiplication(a, b);
        assertEquals(expected,result);
    }

    @Test
    void tesDivision() {
        System.out.println("Деление");
        int a = 5;
        int b = 5;
        int expected = 1;
        int result = calculator.division(a, b);
        assertEquals(expected, result);

    }
    @Test
    void testdDivisionByZero(){
        System.out.println("Деление на ноль");
        int a = 2;
        int b = 0;
        int expected = 0;
        int result = calculator.division(a, b);
        assertEquals(expected, result);
    }
    @Test
    void testDevisionByNull(){
        System.out.println("Деление на null");
        int a = 2;
        int b = Integer.parseInt(null);
        int expected = 0;
        int result = calculator.division(a, b);
        assertEquals(expected, result);
    }
}
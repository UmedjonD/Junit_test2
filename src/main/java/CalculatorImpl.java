public class CalculatorImpl implements Calculator {

    public int addition(int n, int m) {
        int result;
        result = n + m;
        return result;

    }
    public int subtraction(int n, int m) {
        int result;
        result = n - m;
        return result;

    }
    public int multiplication(int n, int m) {
        int result;
        result = n * m;
        return result;

    }
    public int division(int n, int m) throws ArithmeticException {
        int result = 0;
            result = n / m;
        return result;
    }
}

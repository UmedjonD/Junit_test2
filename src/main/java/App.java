public class App {
    public static void main(String[] args) {
        CalculatorImpl calc1 = new CalculatorImpl();
        CalculatorImpl calc2 = new CalculatorImpl();
        CalculatorImpl calc3 = new CalculatorImpl();
        CalculatorImpl calc4 = new CalculatorImpl();

        System.out.println(calc1.addition(4,4));
        System.out.println(calc2.subtraction(4,4));
        System.out.println(calc3.multiplication(4,4));
        System.out.println(calc4.division(4,4));

    }
}

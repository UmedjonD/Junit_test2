public class App {
    public static void main(String[] args) {
        CalculatorImpl calc1 = new CalculatorImpl();
        CalculatorImpl calc2 = new CalculatorImpl();
        CalculatorImpl calc3 = new CalculatorImpl();
        CalculatorImpl calc4 = new CalculatorImpl();

        calc1.addition(2,2);
        calc2.division(2,2);
        calc3.multiplication(2,2);
        calc4.subtraction(2,2);

        System.out.println(calc1);
        System.out.println(calc2);
        System.out.println(calc3);
        System.out.println(calc4);

    }
}

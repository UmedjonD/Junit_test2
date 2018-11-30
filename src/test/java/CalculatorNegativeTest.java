import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculatorNegativeTest {

    CalculatorImpl calculator = new CalculatorImpl();

    @Disabled
    @Test
    void testdDivisionByZeroArithmeticExceptionJe() {

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.division(5,0));
        assertEquals(exception.getMessage(),("/ by zero"));
    }

}

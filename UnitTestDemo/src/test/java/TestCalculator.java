import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void addTest() {
        //       System.out.println("Start addTest!");

        CalculatorImpl calculator = new CalculatorImpl();

        //Pozitiv
        double result = calculator.add(10, 11);
        Assert.assertEquals(21, result, 0.1);

        result = calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);

    }

    @Test
    public void divideTest() {
        CalculatorImpl calculator = new CalculatorImpl();
        double result = calculator.divide(10, 0);

    }
}


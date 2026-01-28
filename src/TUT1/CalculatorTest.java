package src.TUT1;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            System.out.println(calc.add(2, 3));
            System.out.println(calc.divide(2, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}


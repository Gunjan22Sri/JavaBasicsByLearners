class Calculator {
        int add(int a, int b) {
        return a + b;
    }

       int subtract(int a, int b) {
        return a - b;
    }

        int multiply(int a, int b) {
        return a * b;
      }

        double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
          }
        return (double) a / b;
      }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int x = 10;
        int y = 2;

        System.out.println("Addition: " + calc.add(x, y));
        System.out.println("Subtraction: " + calc.subtract(x, y));
        System.out.println("Multiplication: " + calc.multiply(x, y));
        System.out.println("Division: " + calc.divide(x, y));
    }
}

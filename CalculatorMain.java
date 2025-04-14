/* Create a class Calculator with the following methods:
 
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b) (return double)
 
Create a CalculatorMain class to test all the methods with sample inputs and print the results.*/


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
            return 0.0;
        }
        return (double) a / b;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}

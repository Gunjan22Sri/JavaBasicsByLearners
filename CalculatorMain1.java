
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero.");
            return 0; 
        }
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator val = new Calculator();
        
        int a = 10;
        int b = 2;
        
        System.out.println("Addition: " + val.add(a, b));
        System.out.println("Subtraction: " + val.subtract(a, b));
        System.out.println("Multiplication: " + val.multiply(a, b));
        System.out.println("Division: " + val.divide(a, b));
    }
}

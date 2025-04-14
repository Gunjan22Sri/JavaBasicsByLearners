public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int a = 14;
        int b = 7;

        System.out.println("Addition: " + cal.add(a, b));
        System.out.println("Subtraction: " + cal.subtract(a, b));
        System.out.println("Multiplication: " + cal.multiply(a, b));
        System.out.println("Division: " + cal.divide(a, b));
    }
}

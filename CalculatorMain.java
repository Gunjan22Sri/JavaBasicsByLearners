import java.util.Scanner;
class Calculator
{
    public double add(double a, double b)
    {
        return a+b;
    }
    public double subtract(double a, double b)
    {
        return a-b;
    }
    public double multiply(double a, double b)
    {
        return a*b;
    }
    public double divide(double a, double b)
    {
        return a/b;
    }
}
class CalculatorMain
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter two numbers a & b: ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        Calculator calc = new Calculator();
        System.out.println(calc.add(a,b));
        System.out.println(calc.subtract(a,b));
        System.out.println(calc.multiply(a,b));
        System.out.println(calc.divide(a,b));

    }
}
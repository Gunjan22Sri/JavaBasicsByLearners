// Create a class Rectangle with two instance variables length and breadth.
// Use a parameterized constructor to initialize the values.
// Add a method area() to calculate and print the area.
// Create another class RectangleMain to create the object and call the method.
import java.util.Scanner;
class Rectangle
{
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth)
    {
        System.out.println("Area of Reactangle");
        this.length = length;
        this.breadth = breadth;
    }
    public double area()
    {
        return length * breadth;
    }
}
class RectangleMain
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter length and breadth of rectangle");
        double l = scanner.nextDouble();
        double b = scanner.nextDouble();
        Rectangle rect = new Rectangle(l, b);
        System.out.println("Area of Reactangle is: " + rect.area());
    }
}
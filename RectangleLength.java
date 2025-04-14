public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }
}
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(8.0, 4.0);

        rect.area();
    }
}

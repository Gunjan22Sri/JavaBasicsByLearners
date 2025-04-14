public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int len, int brea) {
        length = len;
        breadth = brea;
    }

    public void area() {
        int result = length * breadth;
        System.out.println("Area of the rectangle: " + result);
    }
}

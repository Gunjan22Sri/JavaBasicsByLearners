public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
	rect.area();
    }
}

// Rectangle class
class Rectangle {
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

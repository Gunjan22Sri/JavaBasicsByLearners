class Rectangle {
    int length;
    int breadth;

        Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

        void area() {
        int result = length * breadth; 
        System.out.println("Area of rectangle: " + result);
    }
}

public class RectangleMain {
    public static void main(String[ ] args) {
                Rectangle rect1 = new Rectangle(10, 5);
                rect1.area();
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        // Step 5: Create an object of Rectangle and call the area() method
        Rectangle rect = new Rectangle(10, 5);
        rect.area();
    }
}

//first step one create instance
class Rectangle {
    
    int length;
    int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

 
// Create a class Rectangle with two instance variables length and breadth.
// Use a parameterized constructor to initialize the values.
// Add a method area() to calculate and print the area.
// Create another class RectangleMain to create the object and call the method

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        int result = length * breadth;
        System.out.println("Area: " + result);
        return result;
    }
}

public class RectangleMain {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(4, 3);
        r1.area();
    }
}




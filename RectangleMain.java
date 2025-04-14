/* Create a class Rectangle with two instance variables length and breadth.
Use a parameterized constructor to initialize the values.
Add a method area() to calculate and print the area.
Create another class RectangleMain to create the object and call the method.*/


class Rectangle {
    int length;
    int breadth;

    // Parameterized constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and print area
    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        // Create Rectangle object with length 10 and breadth 5
        Rectangle rect = new Rectangle(10, 5);
        
        // Call area method
        rect.area();
    }
}

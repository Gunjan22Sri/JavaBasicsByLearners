class Rectangle {
    
 double length;
 double breadth;

    
  Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
   void area() {
        double area = length * breadth;
        System.out.println("Area of the rectangle is: " + area);
    }
}

class RectangleMain {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(10, 5);

        
        rect.area();
    }
}
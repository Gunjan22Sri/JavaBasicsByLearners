class Rectangle
{
  int length;
  int breadth;
  
  
  Rectangle(int l, int b)
  {
    length = l;
    breadth = b;
  }
  
  public void area()
  {
    int result = length * breadth;
    System.out.println("Area of Rectangle: " + result);
  }
}

public class RectangleMain
{
  public static void main(String[] args)
  {
    Rectangle rect = new Rectangle(20, 10);
    
    rect.area();
  }
}
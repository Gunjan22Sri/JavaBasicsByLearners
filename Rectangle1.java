class Rectangle{
   int length;
   int breadth;

// constructor method
  Rectangle(int l, int b){
  length = l;
  breadth = b;
  }

// method to find area
  void area(){
  System.out.println("Area of rectangle is :" + length*breadth);
  }

}

class RectangleMain{
 public static void main(String a[]){

// creating object
  Rectangle obj = new Rectangle(50,25);

// calling object
  obj.area();
}
}
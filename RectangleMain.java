class Rectangle{
   int length;
   int breadth;


 public Rectangle(int l, int b){
  length = l;
  breadth = b;
  }


  void area(){
  System.out.println("Area of rectangle is :" + length*breadth);
  }

}

class RectangleMain{
 public static void main(String a[]){


  Rectangle obj = new Rectangle(6,5);


  obj.area();
}
}
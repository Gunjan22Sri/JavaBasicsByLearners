public class Rectangle{

	int length;
	int breadth;

	public Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public void area(){
		int result = length * breadth;
		System.out.println("Area of rectangle: " + result);
	
	}

}
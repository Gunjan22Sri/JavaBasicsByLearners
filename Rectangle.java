class Rectangle{
	int length;
	int breadth;
	Rectangle(int len,int bre){
		length=len;
		breadth=bre;
	}
	void area(){
		int A=length*breadth;
		System.out.println("Area: "+A);
	}
}

class RectangleMain{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,5);
		r.area();
	}
}
class Calculator{
   int a;
   int b;

// Methods to perform operations of a calculator
  int add(int a,int b){
     return a+b;
    }
  int subtract(int a,int b){
     return a-b;
    }
  int multiply(int a,int b){
     return a*b;
    }
  double divide(int a,int b){
     return a/b;
    }
}

class CalculatorMain{
 public static void main(String a[]){
 // lets create an object
	Calculator obj = new Calculator();
	System.out.println(obj.add(10,5));
	System.out.println(obj.subtract(10,5));
	System.out.println(obj.multiply(10,5));
	System.out.println(obj.divide(10,5));
}
}
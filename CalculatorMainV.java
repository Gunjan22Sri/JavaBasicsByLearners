class Calculator{

	int add(int a, int b){
		return a+b;
	}

	int subtract(int a, int b){
		return a-b;
	}

	int multiply(int a, int b){
		return a*b;
	}
	
	double divide(int a, int b){
		return a/b;
	}


}
public class CalculatorMainV {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(2, 4));
		System.out.println("Subtraction: " + calculator.subtract(2, 4));
		System.out.println("Multiplication: " + calculator.multiply(2, 4));
		System.out.println("Dividation: " + calculator.divide(2, 4));

     }
}
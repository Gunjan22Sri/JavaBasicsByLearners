public class CalculatorMain{

	public static void main(String[] args){
		Calculator machine1 = new Calculator();
		
		int a = 10;
		int b = 5;

		System.out.println("Addition: " + machine1.addition(a, b));
        	System.out.println("Subtraction: " + machine1.subtract(a, b));
        	System.out.println("Multiplication: " + machine1.multiply(a, b));
        	System.out.println("Division: " + machine1.divide(a, b));
	}
}
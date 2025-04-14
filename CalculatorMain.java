class Calculator{
	int a;
	int b; 
	public int add(int a, int b){
		return (a+b);

		}
	public int subtract(int a, int b){
		return (a-b);
		}
	public int multiply(int a, int b){
		return (a*b);
		}
	public double divide(int a, int b){
		return (a/b);
		}


	}




class CalculatorMain{
	public static void main(String args[]){
	
		Calculator cal = new Calculator();
		int addition = cal.add(22, 10);
		int subtraction = cal.subtract(20, 15);
		int multiplication = cal.multiply(3, 4);
		double division = cal.divide(5, 3);
	

		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(division);

		}
	
	}
package Com.xworkz.AccessRunner;

import Com.xworkz.Access.Calculator;

public class CalculatorRunner {
	
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		System.out.println(calculator);
		calculator.setBrand("Sony");
		calculator.setColor("Black");
		calculator.setLength(22.5);
		calculator.setPrice(600);
		System.out.println(calculator);

	}


}

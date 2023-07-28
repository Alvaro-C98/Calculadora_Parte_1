package main;

import classes.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator op1 = new Calculator();
		op1.setOperandOne(3000.912);
		op1.setOperandTwo(4000.527);
		op1.setOperation("-");
		op1.performOperation();
		System.out.printf("%.12f",op1.getResult());
	}

}

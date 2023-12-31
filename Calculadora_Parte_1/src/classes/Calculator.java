package classes;

import java.io.Serializable;

public class Calculator implements Serializable{
	private double operandOne;
	private double operandTwo;
	private double result;
	private String operation;
	
	public Calculator() {
		
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if(getOperation().equals("+")) {
			setResult(getOperandOne()+getOperandTwo());
		}else {
			setResult(getOperandOne()-getOperandTwo());
		}
	}
	
}

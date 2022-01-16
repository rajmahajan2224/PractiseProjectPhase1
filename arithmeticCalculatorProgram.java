package com.mahajan;

import java.util.Scanner;

public class arithmeticCalculatorProgram {

	public static void main(String[] args) {
		
		Scanner theValue = new Scanner(System.in);
		
		System.out.println("Enter the two numbers");
		
		int firstNumber=theValue.nextInt();
		int secondNumber= theValue.nextInt();
		
		System.out.println("Enter the operator ");
		char operator = theValue.next().charAt(0);
		
		double Ans = 0;

		switch(operator){
		case '+': Ans = firstNumber + secondNumber;
		break;
		case '-': Ans = firstNumber - secondNumber;
		break;
		case '*': Ans = firstNumber * secondNumber;
		break;
		case '/': Ans = firstNumber / secondNumber;
		break;
		}
		
		System.out.println("the answer is " +Ans);
	}
}

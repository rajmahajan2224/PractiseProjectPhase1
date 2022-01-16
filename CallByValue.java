package com.mahajan;

public class CallByValue {
	int val = 50;
	int operation(int val) {
		val = val * 10 / 100;
		return(val);
	}
	
	public static void main(String [] args) {
		CallByValue a = new CallByValue();
		System.out.println("Before operation value of data " + a.val);
		a.operation(100);
		System.out.println("After operation value of data " + a.val);
	}
}

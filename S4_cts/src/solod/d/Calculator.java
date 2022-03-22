package solod.d;

import solid.d.v2.AddNumbers;
import solid.d.v2.SubstractNumbers;

public class Calculator {
	public enum Operation {ADD, SUBSTRACT, DIVIDE, MULTIPLY};
	public void calculate(double a, double b, int op) {

		double result=0;
		switch(op) {
		case 1:
			result=a+b;
			break;
		case 2:
			result=a-b;
			break;
		case 3:
			result=a*b;
			break;
		default: result=a/b;
		}
		System.out.println(result);
	}
	
	public static void  calculate(double a, double b, AddNumbers op) {

		double result=0;
		System.out.println(result);
	}
	
	public static void calculate(double a, double b, SubstractNumbers op) {

		double result=0;
		System.out.println(result);
	}
}

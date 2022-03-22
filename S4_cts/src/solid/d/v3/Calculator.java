package solid.d.v3;

public class Calculator {
//	public enum Operation {ADD, SUBSTRACT, DIVIDE, MULTIPLY};
//	public void calculate(double a, double b, int op) {
//		double result=0;
//		switch(op) {
//		case 1:
//			result=a+b;
//			break;
//		case 2:
//			result=a-b;
//			break;
//		case 3:
//			result=a*b;
//			break;
//		default: result=a/b;
//		}
//		System.out.println(result);
//	}
	
	public double calculate(double a, double b, Calculation c) {
		return c.calculate(a, b);
	}
}

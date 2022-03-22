package solid.d.v2;

import solid.d.v3.Calculation;

public class AddNumbers implements Calculation {
	@Override
	public double calculate(double a, double b) {
		return a+b;
	}
	
}

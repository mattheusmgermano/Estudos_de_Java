package utilities;

public class Calculator {
	public static double Circunference(double r) {
		var circunference = 2.0 * Math.PI * r;
		return circunference;
	}
	public static double Volume(double r, double h) {
		var baseArea = Math.PI * Math.pow(r, 2);
		var volume = baseArea * h;
		return volume;
	}
}

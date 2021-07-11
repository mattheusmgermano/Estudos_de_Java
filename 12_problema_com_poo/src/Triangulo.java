
public class Triangulo {
	
	public Triangulo(double a, double b, double c) {
		_a = a;
		_b = b;
		_c = c;
	}
	public double _a;
	public double _b;
	public double _c;
	
	public double Area() {
		var p = (_a + _b + _c) / 2.0;
		var area = Math.sqrt(p * (p - _a) * (p - _b) * (p - _c));
		return area;
	}
}

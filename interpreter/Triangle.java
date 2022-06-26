package interpreter;

public class Triangle implements GeometricForm{
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double interpret() {
		return (base * height)/2;
	}

}

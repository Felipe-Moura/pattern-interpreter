package interpreter;

public class Square implements GeometricForm{
	
	private double base;
	private double height;
	
	public Square(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double interpret() {
		return base * height;
	}

}

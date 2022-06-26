import interpreter.Square;
import interpreter.Triangle;

public class Main {

	public static void main(String[] args) {
		
		double base = 10;
		double height = 5.5;
		
		Square mySquare = new Square(base, height);
		Triangle myTriangle = new Triangle(base, height);
		
		System.out.println("Area of the square: " + mySquare.interpret());
		System.out.println("Area of the triangle: " + myTriangle.interpret());

	}

}

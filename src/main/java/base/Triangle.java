package base;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter(){
		return this.side1 + this.side2 + this.side3;
	}
	
	public double getArea(){
		double perimeter = this.getPerimeter() / 2.0;
		return Math.pow(perimeter * (perimeter - this.side1) * (perimeter - this.side2) * (perimeter - this.side3), 0.5);
	}
	
	public String toString(){
		System.out.print("This triangle has sides of length" + this.side1 + ", " + this.side2 + ",and " + this.side3 + ". Its perimeter is " + this.getPerimeter() + ", and the area is " + this.getArea() + ".");
		return null;
	}
}

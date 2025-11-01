package objectclassexample;

public class Squre implements Shape{
	double side;
	
	public Squre(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}

	@Override
	public String toString() {
		return "["+"Squre"+" side=" + side +" Area"+"="+getArea()+ "]";
	}
	
}

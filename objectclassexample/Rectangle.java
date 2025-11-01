package objectclassexample;

public class Rectangle implements Shape{
	double breadth;
	double height;
	
	public Rectangle(double breadth, double height) {
		super();
		this.breadth = breadth;
		this.height = height;
	}

	@Override
	public double getArea() {
		return breadth*height;
	}

	@Override
	public String toString() {
		return "["+"Rectangle"+"breadth=" + breadth + ", height=" + height +" Area"+"="+getArea()+ "]";
	}
	

}

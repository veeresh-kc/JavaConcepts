package objectclassexample;

public class Circle implements Shape{
	double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}
	@Override
	public double getArea() {
		
		return 3.142*r*r;
	}
	@Override
	public String toString() {
		return "["+"Circle"+" r=" + r +" Area"+"="+getArea()+ "]";
	}

}

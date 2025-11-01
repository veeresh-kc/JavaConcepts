package objectclassexample;

public class Runner {
public static void main(String[] args) {
	Shape[]shp= {new Circle(14.6),new Squre(12.9),new Circle(5.7),new Rectangle(7.9,6.7),new Circle(3.4),new Squre(6.5)};
	Shape bs=getBiggest(shp);
	System.out.println(bs);
}
static Shape getBiggest(Shape[] shp) {
	Shape big=shp[0];
	for(int i=1;i<shp.length;i++) {
		if(shp[i].getArea()>big.getArea())
			big=shp[i];	
	}
	return big;
}
}





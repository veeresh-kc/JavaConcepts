package constructor;

public class Apple1 extends Fruit {
Apple1()
{
	super(100);
	System.out.println("i am Apple clas constr 1");
}
Apple1(int x)
{
	super();
	System.out.println("i am Apple clas constr 2");
}
public static void main(String[] args) {
	Apple1 a1=new Apple1();
	Apple1 a2=new Apple1(100);
}
}

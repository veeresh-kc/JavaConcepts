
public class Method{
	void add(int a,long b) {
		long z=a+b;
		System.out.println(z);
	}
	void add(long a,int b) {
		long z=a+b;
		System.out.println(z);
	}
	
}
class MethodOverLoding{
public static void main(String[] args) {
	Method m=new Method();
	m.add(1l,20);
}
}

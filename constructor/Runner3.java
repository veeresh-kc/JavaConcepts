package constructor;
class Runner3 {
Runner3(){
	System.out.println("i am constructor 1");
}
Runner3(int i){
	this(10,20);
	System.out.println("i am constructor 2");
}
Runner3(int i, int j){
	this();
	System.out.println("i am constructor 3");
}
public static void main(String[] args) {
	Runner3 r=new Runner3(10);
}
}

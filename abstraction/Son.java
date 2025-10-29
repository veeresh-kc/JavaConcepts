package abstraction;

public class Son implements Father,Mother{

	@Override
	public void smoke() {
		System.out.println("smoke");
	}
	public static void main(String[] args) {
		Son s=new Son();
		s.smoke();
	}


}

package abstraction;

public class HDFC implements RBI {

	@Override
	public void provideLoan() {
		System.out.println("loan provided at 10% intrest");
		
	}
	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.provideLoan();
		System.out.println(HDFC.x);
		System.out.println(RBI.x);
	}

}

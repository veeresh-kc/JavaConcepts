package encapsulation;

public class RunnerForProduct {
	public static void main(String[] args) {
		Product p=new Product();
		System.out.println("***existing data***");
		System.out.println(p.getpId());
		System.out.println(p.getpName());
		System.out.println(p.getPrice());
		System.out.println("***modifing data***");
		p.setpId(02);
		p.setpName("rekesh");
		p.setPrice(25000);
		System.out.println(p.getpId());
		System.out.println(p.getpName());
		System.out.println(p.getPrice());
	}
}

package encapsulation;

public class Runner1 {
	    public static void main(String[] args) {
	        BankAccount b1 = new BankAccount();
	        BankAccount b2 =new BankAccount();
	        b1.printAccountInfo();
	        b1.deposit(2000);
	        b1.withdraw(1000);
	        b1.transfer(b2, 1500);
	        System.out.println("After Transactions:");
	        b1.printAccountInfo();
	        b2.printAccountInfo();
	    }
}

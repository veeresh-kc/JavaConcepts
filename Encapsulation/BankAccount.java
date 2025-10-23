
package encapsulation;

public class BankAccount {
    private int customerId=101;
    private String name="veeresh";
    private String ifscCode="SBI0057345";
    private String branchName="yalahanka";
    private long accountNumber=64103537000l;
    private double balance=100;
    
    public int getCustomerId() 
    { 
    	return customerId;
    }
    public void setCustomerId(int customerId)
    { 
    	this.customerId = customerId; 
    }

    public String getName() 
    { 
    	return name; 
    }
    public void setName(String name) 
    { 
    	this.name = name; 
    }

    public String getIfscCode() 
    { 
    	return ifscCode; 
    }
    public void setIfscCode(String ifscCode) 
    {
    	this.ifscCode = ifscCode; 
    }

    public String getBranchName() 
    {
    	return branchName;
    }
    public void setBranchName(String branchName) 
    { 
    	this.branchName = branchName; 
    }

    public long getAccountNumber() 
    {
    	return accountNumber; 
    }
    public void setAccountNumber(long accountNumber) 
    { 
    	this.accountNumber = accountNumber;
    }

    public double getBalance() 
    {
    	return balance; 
    }
    public void setBalance(double balance) 
    { 
    	this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: " + amount);
        }
        else 
        {
            System.out.println("Invalid amouts");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to account " + toAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed: insufficient balance or invalid amount.");
        }
    }
    
    public void printAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Branch: " + branchName);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance+"\n");
    
}
    }

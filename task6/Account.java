package task6;

public class Account {
	
	private double total_balance=40000;
	private double deposite;
	private double withdrawl;
	
	public void Account() {
		this.total_balance=20000;
	}                                                
	
	
	public void Account(double deposite,double withdrawl) {
		this.deposite=deposite;
		this.withdrawl=withdrawl;
			
	}
	
	public double checkBalance() {
		return total_balance;
		
	}
	
	public double withdrawl(double withdrawl) {
		System.out.println("Withdrawl amount is : "+withdrawl);
		return (this.total_balance-=withdrawl);
		
	}

	public double deposite(double deposite) {
		System.out.println("Deposite amount is : "+deposite);
		return (this.total_balance+=deposite);
		
	}
	
	public static void main(String[] args) {
		Account a = new Account();
		System.out.println("Total Balance in the Account is : "+a.total_balance);
		System.out.println(" Amount after Withdrawl is : "+a.withdrawl(3000));
		System.out.println("Available balance in accout is : " +a.checkBalance());
		System.out.println(" Amount after deposite is  : "+a.deposite(28000));
		System.out.println("Available balance in account is : " +a.checkBalance());
		
	}

}

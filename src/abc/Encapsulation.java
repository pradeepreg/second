package abc;

public class Encapsulation 
{

	public static void main(String[] args) {
		BankAccount ac= new BankAccount();
		ac.acname="ram";
		
		
		
		ac.deposity(1000);
		
		ac.withdraw(500);
		ac.displaybalance();
	}

}

class BankAccount
{
	private double balance;
	public String acname;
	
	public void deposity(double amount)
	{
		if(amount<=0)
		{
			System.out.println("i dont understand what you are trying to do");
			return;
		}
		this.balance+=amount;
	}
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("you dont have that much money");
			return;
		}
		this.balance=this.balance-amount;
	}
	
	public void displaybalance()
	{
		System.out.println("The account " + acname+ "has Rs"+balance);
	}
}

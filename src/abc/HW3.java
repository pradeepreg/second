package abc;

public class HW3 
{

	public static void main(String[] args) 
	{
            RegmiBank b=new RegmiBank();
            
b.accname="Pradeep";
b.deposit(-1000);
b.withdraw(5000);
b.display();

	}
}
 class RegmiBank 
 {
   
 private double Balance;
 
 public String accname;
  
 public void deposit(double amount)
 {
	 if(amount<=0)
{
	System.out.println("Dear "+ accname+".You cannot depoist that amount  ");	
	return;
}
this.Balance+=amount;


	 
}
 public void withdraw(double amount)
 {
	 if(amount>Balance)
	 {
		 System.out.println("Dear "+ accname +".You don't have that amount.");
		 
	 }
	 else
	 {
 this.Balance=this.Balance-amount;
	 }
 
 
 }
 public void display()
	{
		System.out.println("The account " +accname + " has Rs"+ Balance);
	}
 }
 

	
	
	
	
	
	
	
	
 

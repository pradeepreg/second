package abc;

public class ClassEntry {

	public static void main(String[] args) {
		
		Math m=new Math();
		m.Subtract(20);
	 Pen p=new Pen();
	 p.length=20;
	 p.color="Red";
	 
	
	
	
	}
}



 class Pen
	{
	  public int length;
	  public String color;
	  
	  public void Write()
	  {
		  System.out.println("This pen is "+length+" cm long");
		  System.out.println("This pen has "+color+" color");
	  }
	  
	  
	  
	}
 
 class Math
 {
	 public int Subtract(int a)
	 {
		 System.out.println("int");
		 return a+20;
	 }
	 
	 public int Subtract(int a, int b)
	 {
		 System.out.println("int");
		 return a+b;
	 }
	 public double Subtract(double a, double b)
	 {
		 System.out.println("double");
		 return a-b;
	 }
	 public void add1()
	 {
		 int a=10;
		 int b=20;
		 int c= a+b;
		 System.out.println(c);
	 }
	 
	 public int add2()
	 {
		 int a=10;
		 int b=20;
		 int c= a+b;
		 return c;
	 }
	 
	 public void add3(int a, int b)
	 {
		 int c=a+b;
		 System.out.println(c);
	 }
	 
	 public int add4(int a,int b)
	 {
		 int c= a+b;
		 return c;
	 
	 }
 }



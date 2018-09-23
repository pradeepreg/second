
public class MyClass 
{

	public static void main(String[] args)
	{
	Man m=new Man(100,60,"ram");
	m.Name="shyam";
m.info();
		
	}

}



class Man

{
	public int Height;
	public int Weight;
	public String Name;
	
	public Man()
	{
	//System.out.println("constructor called");
		
		this.Height=10;
		this.Weight=20;
		this.Name="ram";
		
	}
	
	public Man(int h,int w, String n)
	{
		this.Height=h;
		this.Weight=w;
		this.Name=n;
	}
	
	
	public void info()
	{
		System.out.println("His weight is "+Weight +" Kg");
		System.out.println("His name is "+Name +". And His Height is "+ Height +"cm");
		
	}
	
	
}

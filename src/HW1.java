
public class HW1 {

	public static void main(String[] args)
	{
		
		Club a=new Club();
		a.CEO="Perez";
		a.date=1902;
		a.Name="RealMadrid";
	
          a.Info();
	
	}

}










class Club
{ 
	public String Name;
	public String CEO;
	public int date;
	 
	public void Info()
	{
  System.out.println(Name+" was founded in "+date+". "+CEO+" is the President of this club");
  
		
		
	}
	
	
}

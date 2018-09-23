package abc;

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s= new student();
s.setName("ram");
System.out.println(s.getName());
s.setAge(30);
p(s.getAge());
	}
	
	public static void p(Object o)
	{
		System.out.println(o);
	}

}

class student
{
	private String name;
	private int age;
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if(age>100 || age<1)
		{
			System.out.println("error in age");
			age=1;
			return;
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()>5)
		{ 
			System.out.println("error in name");
		this.name="no name";
		return;
		
		}
		this.name = name;
	} 
	
	
}

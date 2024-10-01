package day4_24_09_2024;

public class SingleInheritance_A {

	private
	int a,b;
	
	protected
	int c;
	
	public 
	void accept(int x, int y)
	{
		a=x;
		b=y;
		c=a+b;
	}
	void display()
	{
		System.out.println("Addition is: "+c);
	}
}

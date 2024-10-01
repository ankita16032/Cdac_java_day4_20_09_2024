package day4_24_09_2024;

public class Parameterized_Con_A {

	private
	int a,b;
	
	public
	Parameterized_Con_A(int x, int y)
	{
		a=x;
		b=y;
	}
	Parameterized_Con_A()
	{
		a=100;
		b=50;
	}
	
	void show()
	{
		System.out.println("A ="+a);
		System.out.println("B ="+b);
	}

}

package day4_24_09_2024;

public class Parameterized_Con_B extends Parameterized_Con_A{

	private
	int p,q;
	
	public
	Parameterized_Con_B(int x, int y, int a1, int b1)
	{
		super(x,y);
		p=a1;
		q=b1;
	}
	Parameterized_Con_B()
	{
		p=200;
		q=150;
	}
	void show()
	{
		super.show();
		System.out.println("P= "+p);
		System.out.println("Q= "+q);
	}

}

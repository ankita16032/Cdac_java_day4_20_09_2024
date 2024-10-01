package day4_24_09_2024;

public class SingleInheritance_B extends SingleInheritance_A{

	private 
	int p,q,ans;
	
	public
	void accept_Data(int x, int y)
	{
		p=x;
		q=y;
		ans=(p*q)+c;
	}
	void display()
	{
		super.display();
		System.out.println("Ans :"+ans);
	}
}

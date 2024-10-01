package day4_24_09_2024;

public class Default_sub_B extends Default_sup_A{

	private
	int p,q;
	
	public
	Default_sub_B()
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

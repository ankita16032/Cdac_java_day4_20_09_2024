package day4_24_09_2024;

public class MultilevelInheritance_B extends MultilevelInheritance_A{

	protected
	float bonus;
	
	public 	
	void Bonus(int b)
	{
		
		bonus=b;
	}

	public void display() {
		super.display();
		System.out.println("bonus is: "+bonus);
		
	}

}

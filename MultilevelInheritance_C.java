package day4_24_09_2024;

public class MultilevelInheritance_C extends MultilevelInheritance_B{

	private
	float net,inc;
	
	public
	
	void process()
	{
		//super.accept(0, name, inc);
		net=sal+bonus;
		inc=net*10/100;
	}
	
	void show()
	{
		super.display();
		System.out.println(net);
		System.out.println(inc);
	}

}

package day4_24_09_2024;

public class MultilevelInheritance_A {

	private int eid;
	String name;
	protected float sal;

	public void accept(int e, String n, float f) {
		eid = e;
		name = n;
		sal = f;
	}
	public void display()
	{
		System.out.println("eid is: "+eid);
		System.out.println("name is: "+name);
		System.out.println("sal is: "+sal);
	}

}

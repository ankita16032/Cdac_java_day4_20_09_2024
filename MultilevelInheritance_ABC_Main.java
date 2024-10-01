package day4_24_09_2024;

public class MultilevelInheritance_ABC_Main {
public static void main(String[] args) {
	MultilevelInheritance_C  a= new MultilevelInheritance_C();
	a.accept(1, "ank", 9000);
	a.Bonus(200);
	a.process();
	a.display();
	
}
}
/*
eid is: 1
name is: ank
sal is: 9000.0
bonus is: 200.0*/
package oopsinheritance;

class Parent{
	int a=10;
	void m1()
	{
		System.out.println("This is m1 Parent method");
	}
}

class Child extends Parent
{
	int b=13;
	void m2()
	{
		System.out.println("This is m1 Child class method");
		
	}
	
}




public class SingleInheritance {

	public static void main(String[] args) {
		 
		Child c = new Child();
		System.out.println(c.a);
		
		c.m1();
		c.m2();
		
		
		

	}

}

package oopsPolymorphism;

class RBI{
	int a=19;
	void m1()
	{
		System.out.println(a+" This is m1 method of class RBI");
	}
}

class SBI extends RBI{
	
	void m1(int b)
	{
		System.out.println(b+" This is m2 method of class SBI");
	}
}


class CanaraBank extends RBI
{
	void m1(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void m2(String a, int b)
	{
		System.out.println(a+b);
	}
}
public class MethodOverLoadinf {

	public static void main(String[] args) {
		
		CanaraBank cb = new CanaraBank();
		System.out.println(cb.a);
		
		cb.m1();
		cb.m2("Ravu", 9);
		

	}

}

package oops;

class RBI{
	String color = "Ravi";
	
	void m1()
	{
		System.out.println(color);
	}
}

class SBI extends RBI
{
	String name = "Orange";
	void m2()
	{
		System.out.println(name);
		System.out.println(super.color);
	}
}

public class SuperKeyWord {

	public static void main(String[] args) {
		
		SBI sb = new SBI();
		System.out.println(sb.name);
		sb.m2();

	}

}

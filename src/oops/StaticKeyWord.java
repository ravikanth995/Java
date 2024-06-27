package oops;

public class StaticKeyWord {

	static int a = 10;
	int b = 12;
	
	static void m1()
	{
		System.out.println("This is m1 static method");
	}
	
	void m2()
	{
		System.out.println("This is non-static m2");
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
        m1();
        
        StaticKeyWord wd = new StaticKeyWord();
        System.out.println(wd.b);
        wd.m2();
        
        System.out.println(wd.a);
        wd.m1();

	}

}

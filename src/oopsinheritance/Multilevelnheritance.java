package oopsinheritance;

class  ParDada
{
	int a =19;
	
	void m1()
	{
				System.out.println("This is Par Dada Class m1"+"\na value :"+a);
	}
}

class Dada extends ParDada
{
	int b = 12; 
	void m2()
	{
		System.out.println("This is Dada Class m2 method"+"\nb value is "+b);
	}
}

class Baba extends Dada
{
	int c = 22;
	void m3()
	{
		System.out.println("This is Baba class m3 method"+"\nc value :"+c);
	}
}

class Bachha extends Baba
{
	int d = 99;
	void m4()
	{
		System.out.println("This is Bachha class m4 method"+"\nd value :"+d);
	}
}


public class Multilevelnheritance {

	public static void main(String[] args) {
		
		Bachha b = new Bachha();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}

}

package oopsPolymorphism;

public class ConstructorDemo {
	
	int a = 19;
	int b = 18;
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int d, double e)
	{
		System.out.println(d+e);
	}
	
	void totalSum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		cd.sum();
		cd.sum(21, 23.5);
		cd.sum(2, 6);
		cd.totalSum();
		
		
	}

}

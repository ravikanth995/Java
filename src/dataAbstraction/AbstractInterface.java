package dataAbstraction;

interface akkaar{
	
	int a = 18;
	int b = 16;
	
	void circle();
	
	default void square()
	{
		System.out.println("This is Square method in Default method in Interface Shape");
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle method in Interface Shape as Static method");
	}
}

public class AbstractInterface implements akkaar{

	public void circle()
	{
		System.out.println("This is Abstract method in Class: AbstractInterface Class : of Shape Interface");
	}
	public static void main(String[] args) {
		
		akkaar sh = new AbstractInterface();
		akkaar.rectangle();
		sh.circle();
		sh.square();
		System.out.println(sh.a*sh.b);

	}

}

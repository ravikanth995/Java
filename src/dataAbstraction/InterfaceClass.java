package dataAbstraction;

interface Shape{
	int length = 10;
	int width = 12;
	
	
	void circle(); //Abstract methods
	
	default void square()
	{
		System.out.println("This is Default method in Shape Interface");
	}
	
	static void rectangle()
	{
		System.out.println("This is Static method in Shape Interface");
	}
	

	
		
	
	
	
}


public class InterfaceClass implements Shape{
	
	public void circle()
	{
		System.out.println("This is abstract method in Interface Class which is made public");
	}

	public static void main(String[] args) {
		
//		InterfaceClass ic = new InterfaceClass();
//		ic.circle();
//		
//		ic.square();
//	    Shape.rectangle();
//	    System.out.println(Shape.length);
//	    System.out.println(Shape.width);
		
		Shape sh = new InterfaceClass();
		sh.circle();
		sh.square();
		
		System.out.println(sh.length*sh.width);
	}

}

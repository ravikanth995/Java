package oops;

public class ConstructorJava {
	
	int x;
	String y;
	
	ConstructorJava()
	{
		x = 12234;
		y = "SamSung";
	}
	
	ConstructorJava(int mobile, String Model)
	{
		x = mobile;
		y = Model;
	}
	
	void display()
	{
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		
		ConstructorJava c = new ConstructorJava();
		c.display();
		
		ConstructorJava cc = new ConstructorJava(1231, "Xiome");
		cc.display();

	}

}

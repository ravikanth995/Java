package oopsmMethod;

public class MethodsJava {
	
	
	//1. No Parameter and No Return Value
	void m1()
	{
		System.out.println("Hello World! m1 Method");
	}
	
	//No Parameter and Returns Value
	
	String m2()
	{
		return "Hellow Worlds.. m2 Method";
	}
	
	//Parameter and No Return Value
	void m3(String name)
	{
		System.out.println("Hello World.. m3 Method"+name);
	}

	//4. Parameter and returns Value
	String m4(String names)
	{
		return "Hello WOrld.. m4 method";
	}

	public static void main(String[] args) {
		
		MethodsJava mj = new MethodsJava();
		mj.m1();
		String var = mj.m2();
		System.out.println(var);
		
		mj.m3("Ravi");
		
		String vars = mj.m4("Ravikanth");
		System.out.println(vars);
				
				
	}

}

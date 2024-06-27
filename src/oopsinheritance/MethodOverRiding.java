package oopsinheritance;

class RBI
 {
     double roi()
     {
    	 return 12.3;
     }
}

class SBI   extends RBI{
	double roi()
	{
		return  10.7;
	}
}

class ICICI    extends RBI
{
	double roi()
	{
		return 11.7;
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {

		SBI sb = new SBI();
		double r = sb.roi();
		System.out.println(r);
		
		ICICI ic = new ICICI();
		double rr = ic.roi();
		System.out.println(rr);
	}

}

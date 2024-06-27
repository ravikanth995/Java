package dataAbstraction;

interface RBI
{
	double roi = 12.4;
	double repoRate = 1.9;
	
	void reverseRR();
	
	default void interestRare()
	{
		System.out.println("This is default InterestRate of Interface RBI");
	}
	
	static void CashFlow()
	{
		System.out.println("This is static cash flow method in RBI Interface");
	}
}

public class AbstractMethods implements RBI{

	public void reverseRR()
	{
		System.out.println("This is Public Abstract Method in AbstractMethods Class");
	}
	
	public static void main(String[] args) {
		
		RBI rb = new AbstractMethods();
		rb.interestRare();
		rb.reverseRR();
	    RBI.CashFlow();
	    System.out.println(RBI.repoRate);
	    System.out.println(RBI.roi);

	}

}

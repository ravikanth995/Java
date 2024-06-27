package javaInterviewPractice;

public class DigitCount {

	public static void main(String[] args) {
		
		int num = 1245;
		int count=0;
	    while(num>0)
	    {
              num /= 10;
              count++;
	    	
	    }
System.out.println(count);

                  for(; num!=0; num /= 10)
                  {
                	  count++;
                  }
                  System.out.println(count);
	}

}

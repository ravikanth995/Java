package oopsPolymorphism;

public class ConstructorOverLoading {
	
	double width, height, depth;
	
	ConstructorOverLoading()
	{
		width = height= depth = 0;
	}
	
	ConstructorOverLoading(double w, double h, double d)
	{
		this.width = w;
		this.height =h;
		this.depth =d;
	}
	
	ConstructorOverLoading(double length)
	{
		width = height = depth = length;
	}
	
	double volume()
	{
	return height*width*depth;	
	}

	public static void main(String[] args) {
		
		ConstructorOverLoading cc= new ConstructorOverLoading();
		System.out.println(cc.volume());
		
		ConstructorOverLoading c= new ConstructorOverLoading(23.5, 67.6, 99.0);
		System.out.println(c.volume());

	}

}

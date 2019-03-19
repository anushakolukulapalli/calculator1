package calculator1;

public class calci {
	public int add(int firstno,int secondno)
	{
		return firstno+secondno;
	}
	public int multiply(int firstno,int secondno)
	{
		return firstno*secondno;
	}
	public double divide(int firstno,int secondno)
	{
		double ans=1;
		try {
		   ans=firstno/secondno;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		return ans;
		
	}

}

class Exception
{
	public void check(int c,int d) throws ArithmeticException
	{
		int a=10,result;
		result=a/(c-d);
		throw new ArithmeticException("Divison by Zero");
	}
	public static void main(String[] args)
	{
	  Exception e = new Exception();
		try{
			e.check(2,2);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception Caught");
			System.out.println(ex);
		}
		finally
		{
			System.out.println("All good");
		}
	}
	
}

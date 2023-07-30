package Exception;

public class TryCatchFinally {

	public static void main(String[] args) 
	{
		String a="null";
		
		try
		{
			System.out.println(a.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println("ai is null");
		}
		
		finally
		{
			System.out.println("Hii GM All");
		}
		

	}

}

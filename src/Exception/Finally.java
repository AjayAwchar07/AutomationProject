package Exception;

public class Finally {

	public static void main(String[] args) 
	{
		String a="hi";
		
		try
		{
			System.out.println(a.charAt(10));
		}
		
		finally
		{
			System.out.println("HI GM");
		}
		

	}

}

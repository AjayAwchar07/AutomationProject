package P0pUps;

import java.util.ArrayList;
import java.util.HashSet;

public class SetToList 
{

	public static void main(String[] args) 
	{
		HashSet<Integer>hs=new HashSet<>();
		
		hs.add(5);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(3);
		
		System.out.println(hs);
		
		ArrayList<Integer>al=new ArrayList<>(hs);
		System.out.println(al);
		

	}

}

package AndroidLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class arrayCollection {

	public static void main(String[] args) {
		
//		ArrayList<String>names=new ArrayList<>(); 
//		Scanner in=new Scanner(System.in) ;
//		int n=in.nextInt() ; 
//		for(int i=0 ;i<n ;i++)
//		{
//			String a=in.next() ;
//			names.add(a) ;
//		}
//		
//		//System.out.println(names.size());
//		
//		Collections.sort(names);
//		for(String i: names)
//		{
//			System.out.println(i);
//		}
//
		Map<String ,String > c=new HashMap<String  ,String >()  ;
		
			c.put("shasrif", "01832944519") ;
			c.put("omsar" , "123") ;
			
			c.put("sharif", "01832944519") ;
			c.put("omar" , "1233") ;
			
			c.put("shsarif", "201832944519") ;
			c.put("omar" , "1223") ;
			
			for(String i : c.keySet())
			{
				System.out.println(i);
			}
			for(String i : c.values())
			{
				System.out.println(i);
			}
		
		
		
		
		
		
		
	}
	
		

}

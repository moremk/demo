package dsa;

import java.util.Arrays;
import java.util.List;

public class Findevennumberusinglistrecursion {
	
	
	
   	public static void evennumber(List<Integer> list,int index)
	{
		if(index>=list.size())
		{
			return;
		}
   		
   		
		if(list.get(index)%2==0)
		{
			System.out.println(list.get(index));
			
		}
		evennumber(list,index+1);	
		
		
	}

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,4,5,6,7,8);

           evennumber(list,0);
     ;
	}

}

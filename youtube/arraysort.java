package youtube;

import java.util.Arrays;

import java.util.*;

public class arraysort {

	public static void main(String[] args) {
		/*int a[]= {1,3,5,2,6};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		
		List<Integer>list=Arrays.asList(1,3,5,2,6);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}

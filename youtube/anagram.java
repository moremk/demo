package youtube;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		 String name="Cat";
		  String name1="Mat";
		  
		  String l=name.toLowerCase();
		  String l1=name.toLowerCase();
		  char[] a=l.toCharArray();
		  char[] a1=l1.toCharArray();
		  if(name.length()==name1.length())
		  {
		  Arrays.sort(a); 
		  Arrays.sort(a1); 
		  boolean compare=Arrays.equals(a, a1);
		  if(compare)
		  {
			  System.out.println("anagram");
		  }
		  }
		  else
		  {
			  System.out.println("not anagram");
		  }
		  

		  

	}
	
	}



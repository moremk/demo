package dsa;

public class Stringlengthusingrecursion {
	
	public static int Test(String i)
	{
		 if (i.equals("")) {
	            return 0;
	        }
	        // Recursive case: length is 1 (current character) + length of the rest of the string
	        return 1 + Test(i.substring(1));
	    }
	
	
	public static void main(String [] args)
	{
		String l="Mahesh";
		
		System.out.println(Test(l));
	}

}

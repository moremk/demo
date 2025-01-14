package dsa;

public class Recursionfact {
	
	
	public static void Factnumber(int n,int fact)
	{
	
		if(n==1)
		{
			System.out.println(fact);	
			return;
		}
		Factnumber(n - 1, fact*n); //recursion is a function is call itself
	}

	public static void main(String[] args) {
		
		int n=3;
		int fact=1;
		Factnumber(n,fact);

	}

}

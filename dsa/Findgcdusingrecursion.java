package dsa;

public class Findgcdusingrecursion {
	
	public static int GCD(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		
		return GCD(b,a%b);
	}

	public static void main(String[] args) {
	
		
		int n1=56;
		int n2=98;
		System.out.println(GCD(n1,n2));
	
		

	}

}

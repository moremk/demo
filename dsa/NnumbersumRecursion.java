package dsa;

public class NnumbersumRecursion {
	
	public static void nnumberSum(int n,int sum)
	{
		if(n<=1)
		{
			System.out.println(sum);
			return;
		}
		sum=sum+n;
		nnumberSum(n-1,sum);
	}
	

	public static void main(String[] args) {
		
        int n=15;
        int sum=0;
		nnumberSum(n,sum);
	}

}

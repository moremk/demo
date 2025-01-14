package youtube;

public class palindrom {

	public static void main(String[] args) {
    
		int n=121,nm;
		
		int digit,sum=0;
		
		nm=n;
		while(nm>0)
		{
			digit=nm%10;
			sum=sum*10+digit;
			nm/=10;
		}
		
		if(n==sum)
		{
			System.out.println("palindrom");
		}
		else {
			System.out.println("not Palindrom");
		}

	}

}

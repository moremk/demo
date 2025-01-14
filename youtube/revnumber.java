package youtube;

public class revnumber {

	public static void main(String[] args) {
		int n=123;
		int digit,rev=0;
		
		while(n>0)
		{
			digit= n%10;
			rev=rev*10+digit;
			n/=10;
		}
		System.out.println("rev number=>"+rev);

	}

}

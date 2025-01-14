package youtube;

public class armstrongnumber {

	public static void main(String[] args) {
		int n=153,nm;
		
		int digit,sum=0;
		
		nm=n;
	 while(nm!=0)
	 {
		 digit= nm%10;
		 sum +=Math.pow(digit, 3);
		 nm/=10;
	 }
	 if(n==sum)
	 {
		 System.out.println("Armstrong");
	 }
	 else {
		 System.out.println("Not Amrstrong");
	 }
		
	}

}

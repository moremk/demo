package youtube;

public class leafyear {

	public static void main(String[] args) {
		
		int year=2013;
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
		
			System.out.println("leaf year");
		}
		else {
			System.out.println("not leaf year");
		}
		
	}

}

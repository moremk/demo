package youtube;

public class fobi {

	public static void main(String[] args) {
		int n=11;
		
		int f1=0,f2=1,f3=0;
		
		for(int i=0;i<n;i++)
		{
			f1=f2;
			f2=f3;
			f3=f1+f2;
			System.out.println(f3);
		}
		
	}

}

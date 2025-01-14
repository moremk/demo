package youtube;

public class arrayswap {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			a[0]=a[5];
			a[1]=2;
			a[i]--;
			System.out.println(a[i]);
		}
		
		
		
	}

}

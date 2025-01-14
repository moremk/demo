package youtube;

public class reversearray {
	
	public static void main(String [] arg)
	{
		
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

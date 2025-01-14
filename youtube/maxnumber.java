package youtube;

public class maxnumber {

	public static void main(String[] args) {
		int a[]= {1,4,2,5,6,3};
		int max=0;
		int max2=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(max2<a[i]&& max>a[i])
			{
				max2=a[i];
			}
		}
		System.out.println(max);
		System.out.println(max2);

	}

}

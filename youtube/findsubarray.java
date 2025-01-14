package youtube;

public class findsubarray {

	public static void main(String[] args) {
		
		int a[]={3,1,4,5,1,3};
		
		int sum=7;
		
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			if(a[start]+a[end]<sum)
			{
				start++;
			}
			if(a[start]+a[end]>sum)
			{
				start--;
			}
			if(a[start]+a[end]==sum)
			{
				
				System.out.println("["+a[start]+","+a[end]+"]");
				start++;
				end--;
			}
		}
		
		
	}

}

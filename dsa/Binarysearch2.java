package dsa;

public class Binarysearch2 {
	
	public static int binarysearch(int a[],int x)
	{
		int start=0;
		int end=a.length-1;
		
		int mid=start+(end-start)/2;
		
		while(start<=end)
		{
			if(a[mid]==x)
			{
				return mid;
			}
			else if(a[mid]>x)
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	     int[] a = {2, 3, 4, 10, 40, 55, 60, 99};
	
	  int x=4;
     int s=binarysearch(a,x);

         System.out.println("Element found at index: " + s);
     }
	

}

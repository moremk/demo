package dsa;
public class Bubblesort {

	
	
	public static void main(String[] args) {
	  
		
		int a[]= {5,3,6,2,7,8};  //  Time Complexity: O(n2)   
		                         // Bubble Sort is the simplest sorting algorithm that sort element in ascending order
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			System.out.println(a[i]);
		}
	}

}

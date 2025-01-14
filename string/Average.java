package string;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
     int sum=0;
     float avg=0.0f;
	  
	  System.out.println("\n N1=>");
	  int n=sc.nextInt();
	  
	  
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  for(int i=0;i<n;i++)
	  {
	   sum=sum+a[i];
	  }
	  avg = (float) sum / n;
	  
	   System.out.println("AVG=>"+avg);
	  
	}

}

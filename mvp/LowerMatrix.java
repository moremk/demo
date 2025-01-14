package mvp;

public class LowerMatrix {

	public static void main(String[] args) {
	
		
		int [][] a= {{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
		
		int n=4;
		System.out.println("================");
		System.out.println("Orizional matrix");
		 for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(a[i][j]+" ");
	            }
	            System.out.println();
	        }
	
		
		int [][] b=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				b[i][j]=a[i][j];
				
				}
		}
		System.out.println("================");
		System.out.println("Lower Triangular matrix");
		 for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(b[i][j]+" ");
	            }
	            System.out.println();
	        }
		 
		 for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(j>=i)
					{
					b[i][j]=a[i][j];
					}
					else {
						b[i][j]=0;
					}
					
					}
			}
		 
		System.out.println("================");
		System.out.println("Upper Triangular matrix");
		 for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(b[i][j]+" ");
	            }
	            System.out.println();
	        }
		

	}
}



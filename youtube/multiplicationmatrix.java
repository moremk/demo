package youtube;

public class multiplicationmatrix {
	
	public static void main(String [] args)
	{
	
		int a[][]= {{2,4},{3,5},{5,3}};
		int b[][]= {{3,2},{1,6},{3,8}};
		
		
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					c[i][j]=a[i][k]* b[k][j];
				}
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("\n\t"+c[i][j]);
			}
			
			}
	
}

}

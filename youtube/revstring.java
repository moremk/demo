package youtube;

public class revstring {

	public static void main(String[] args) {
		 
		String str="Mahesh";
		
		char ch[]=str.toCharArray();
		
		String rev="";
		for(int i=ch.length-1;i>0;i--)
		{
			rev +=ch[i];
		}
		System.out.println(rev);

	}

}

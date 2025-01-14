package youtube;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class readfile {
	
	
	public static void main(String [] args)
	{
		Path path=Paths.get("C:\\\\Users\\\\Mahesh\\\\Documents\\\\file.txt");
		
		try {
			List<String> list=Files.readAllLines(path);
			list.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
				
	}

}

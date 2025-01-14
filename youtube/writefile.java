package youtube;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class writefile {

	public static void main(String[] args) {
		
		Path path=Paths.get("C:\\\\Users\\\\Mahesh\\\\Documents\\\\demo.txt");
		List<String> list=Arrays.asList("Hello, I am Software Developer");
		
		try {
			Files.write(path, list);
			System.out.println("File write successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}

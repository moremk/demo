package youtube;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class deletefile {

	public static void main(String[] args) {

		
		List<String>filenames=Arrays.asList("C:\\Users\\Mahesh\\Documents\\file.txt");
		
		for(String pathname : filenames)
		{
			Path filepath=Paths.get(pathname);
			
			try {
				Files.delete(filepath);
				System.out.println("file"+pathname+"deleted");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}

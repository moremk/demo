package youtube;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class countchar {

	public static void main(String[] args) {
	
		String str[]= {"mahesh","More","More"};
		
		List<String> l=Arrays.asList(str);
		
		Map<String,Long> map=l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		System.out.println(map);
		
		
	}

}

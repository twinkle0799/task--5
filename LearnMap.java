import java.util.HashMap;
import java.util.Map;
	public class LearnMap
	{
	public static void main(String[] args)
	{
	Map<String,Integer> numbers=new HashMap<>();
	numbers.put("One",1);
	numbers.put("two",2);
	numbers.put("three",3);
	//numbers.put("three",41);
	/* if(!numbers.containsKey("three"))
	{
		numbers.put("three",41);
	}  
	numbers.putIfAbsent("three",41);
	*/
	System.out.println(numbers);
	System.out.println(numbers);
	for(Map.Entry<String,Integer> e:numbers.entrySet());
	System.out.println(e);
	System.out.println(e.getKey());
	
	}
	}
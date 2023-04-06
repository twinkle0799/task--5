import java.util.HashSet;
import java.util.Set;
public class Learnset
{
public static void main(String[] args)
{
	Set<Integer> set= new HashSet<>();
	set.add(32);
	set.add(12);
	set.add(42);
	set.add(62);
	
	System.out.println(set);
	set.remove(12);
	System.out.println(set);
	System.out.println(set.contains(34));
	}
	}

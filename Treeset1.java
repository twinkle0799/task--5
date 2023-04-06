import java.util.TreeSet;
import java.util.Set;
public class Treeset1
{
public static void main(String[] args)
{
	Set<Integer> set= new TreeSet<>();
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

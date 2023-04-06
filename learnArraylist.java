import java.util.*;
 public class learnArraylist
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1,50);
		System.out.println(list);
		list.add(5);
		ArrayList<Integer> newlist= new ArrayList<>();
		newlist.add(150);
		list.addAll(newlist);
		System.out.println(list);
		System.out.println(list.get(1));
   }
  }
  
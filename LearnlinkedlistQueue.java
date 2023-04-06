import java.util.LinkedList;
import java.util.Queue;
public class LearnlinkedlistQueue
{
	public static void main(String[] args)
{
		Queue<Integer> queue=new LinkedList<>();
	queue.offer(12);
	queue.offer(10);
	queue.offer(11);
	/*offer ->add element in queue*/
	 System.out.println(queue); 
	 System.out.println(queue.poll()); 
	}
	}
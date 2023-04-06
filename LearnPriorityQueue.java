import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class LearnPriorityQueue
{
	public static void main(String[] args)
{
	PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
	pq.offer(13);
	pq.offer(12);
	pq.offer(14);
	pq.offer(15);
	pq.offer(16);
 System.out.println(pq);
	pq.poll();
 System.out.println(pq);
 
}
}

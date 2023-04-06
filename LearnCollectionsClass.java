  import java.util.ArrayList;
  import java.util.Collections;
  import java.util.Comparator;
  import java.util.List;
   
   public class LearnCollectionsClass
   {
   public static void main(String[] args)
   {
   List<Integer> li=new ArrayList<>();
   li.add(14);
   li.add(18);
   li.add(147);
   li.add(148);
   li.add(10);
   li.add(11);
   li.add(146);
   //System.out.println(Collection.frequency(li, o:9));
   System.out.println("min" +Collections.min(li));
   System.out.println("max" +Collections.max(li));
   Collections.sort(li);
   System.out.println(li);
   Collections.sort(li,Comparator.reverseOrder());
   System.out.println(li);
   }
   }
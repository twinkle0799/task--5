import java.util.ArrayList;
import java.util.Stack;
 public class LearStack1
  {
 public static void main(String[] args)
  {
	  Stack<String> animals=new Stack<>();
 animals.push("rat");
 animals.push("dog");
 animals.push("cat");
 animals.push("tommy");
 System.out.println("Stack:"+ animals);
 System.out.println(animals.peek());
 animals.pop("cat");
 System.out.println(animals.peek());
     }  
    }
       
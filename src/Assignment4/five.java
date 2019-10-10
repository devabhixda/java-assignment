import java.util.LinkedList;
import java.util.Iterator;
class five{
public static void main(String args[]){
LinkedList ll = new LinkedList();
ll.add("red");
ll.add("green");
ll.add("blue");
System.out.println("First occurence: "+ll.getFirst());
System.out.println("Last occurence: "+ll.getLast());
}
}

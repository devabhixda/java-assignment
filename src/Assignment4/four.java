import java.util.LinkedList;
import java.util.Iterator;
class four{
public static void main(String args[]){
LinkedList ll = new LinkedList();
ll.add("red");
ll.add("green");
ll.addLast("blue");
Iterator A = ll.iterator();
while(A.hasNext())
System.out.println(A.next());
}
}

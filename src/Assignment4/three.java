import java.util.ArrayList;
import java.util.Iterator;
class three{
public static void main(String args[]){
ArrayList al = new ArrayList();
al.add("red");
al.add("green");
al.add("blue");
ArrayList al2 = new ArrayList();
Iterator A = al.iterator();
while(A.hasNext())
al2.add(A.next());
Iterator B = al2.iterator();
while(B.hasNext())
System.out.println(B.next());
}
}

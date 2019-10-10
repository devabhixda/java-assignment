import java.util.ArrayList;
import java.util.Iterator;
class two{
public static void main(String args[]){
ArrayList al = new ArrayList();
al.add("red");
al.add("green");
al.add("blue");
al.remove(2);
Iterator A = al.iterator();
while(A.hasNext()){
System.out.println(A.next());
}
}
}

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
class six{
public static void main(String args[]){
LinkedList<String> ll = new LinkedList<String>();
ll.add("red");
ll.add("green");
ll.add("blue");
Scanner scan = new Scanner(System.in);
String a=scan.next();
if(ll.contains(a)){
System.out.println("Color is present!");
}else{
System.out.println("Color not present");
}
}
}

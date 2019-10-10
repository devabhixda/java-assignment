import java.util.HashSet;
class Seven{
public static void main(String args[]){
	HashSet<String> hl=new HashSet<String>();
	hl.add("red");
	hl.add("blue");
	hl.add("green");
	System.out.println("Before removal"+hl);
	hl.removeAll(hl);
	System.out.println("After removal"+hl);
}
}

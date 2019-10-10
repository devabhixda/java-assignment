import java.util.TreeSet;
class Ten{
public static void main(String args[]){
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("red");
	ts.add("blue");
	ts.add("green");
	TreeSet<String> tsn=(TreeSet<String>)ts.clone();
	for(String e:tsn)
	System.out.println(e);
}
}

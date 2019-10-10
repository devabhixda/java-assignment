import java.util.*;
class MathsException{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float x = sc.nextInt();
	float y = sc.nextInt();
	try{
	if(y==0){
		throw new ArithmeticException("Divison by zero not defined");
		}
	else{
		System.out.println("The value of the division is = "+x/y);
		
	}	
	
	
	}
	catch(Exception e){
		System.out.println("The error thrown is "+e.getMessage());
	}
	
	}
	
	
	
	}





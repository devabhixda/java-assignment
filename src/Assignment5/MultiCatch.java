class MultiCatch{
public static void main(String args[]){

	int array[] = {20,10,40};
	int num1 = 15,num2=10;
	int result = 10;
	try{
		result = num1/num2;
		System.out.println("The result is "+result);
		for(int i=5;i>=0;i--){
			System.out.println("The value of Array is "+array[i]);
		
		}
	
	
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array is out of Bounds");
	}catch(ArithmeticException e){
		System.out.println("Can't divide by Zero"+e.getMessage());
	}


}




}

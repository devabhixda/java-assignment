import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        double a=0.0,b=0.0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number- ");
        a=scan.nextDouble();
        System.out.print("Enter Second number- ");
        b=scan.nextDouble();
        Character operator;
        System.out.print("Enter the operator- ");
        operator=scan.next().charAt(0);
        double result=0.0;
        // switch statement with int data type
        switch (operator) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
        }
        System.out.println("The result is- "+result);
    }
}

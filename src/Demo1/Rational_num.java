package Demo1;

import java.util.Scanner;

public class Rational_num {
    private int num, den;
    //Un-Parameterized constructor
    Rational_num(){
        num=1;
        den=1;
    }
    //Constructor with 2 params
    Rational_num(int result_n,int result_d){
        int x=(result_n < 0 ? -result_n : result_n);;
        if(result_n>result_d){
            x = (result_d < 0 ? -result_d : result_d);
        }
        if(result_n!=0 && result_d!=result_n && result_d%result_n==0){
            result_d=result_d/result_n;
            result_n=1;
            if(result_d<0){
                result_d*=-1;
                result_n*=-1;
            }
        }
        else if(result_n%result_d==0){
        }
        else{
            for(int i=2;i<x;i++){
                if(result_n%i==0 && result_d%i==0){
                    result_n=result_n/i;
                    result_d=result_d/i;
                }
            }
            if(result_d<0){
                result_d*=-1;
                result_n*=-1;
            }
        }
        num=result_n;
        den=result_d;
    }
    //Main method
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numerator and Denominator for num 1");
        Rational_num num1 = new Rational_num(input.nextInt(),input.nextInt());
        System.out.println("Enter Numerator and Denominator for num 2");
        Rational_num num2 = new Rational_num(input.nextInt(),input.nextInt());
        add(num1.num,num1.den,num2.num,num2.den);
        subtract(num1.num,num1.den,num2.num,num2.den);
        multiply(num1.num,num1.den,num2.num,num2.den);
        divide(num1.num,num1.den,num2.num,num2.den);
    }
    //Add
    public static void add(int a,int b, int c, int d){
        int result_n=0;
        result_n = (a*d+b*c);
        int result_d = (b*d);
        System.out.println("Addition="+simplify(result_n,result_d));
    }
    //Subtract
    public static void subtract(int a,int b, int c, int d){
        int result_n=0;
        result_n = (a*d-b*c);
        int result_d = (b*d);
        System.out.println("Subtraction="+simplify(result_n,result_d));
    }
    //Multiply
    public static void multiply(int a,int b, int c, int d){
        int result_n=0;
        result_n = (a*c);
        int result_d = (b*d);
        System.out.println("Multiplication="+simplify(result_n,result_d));
    }
    //Divide
    public static void divide(int a,int b, int c, int d){
        int result_n=0;
        result_n = (a*d);
        int result_d = (b*c);
        System.out.println("Division="+simplify(result_n,result_d));
    }
    public static String simplify(int result_n,int result_d){
        String result;
        int x=(result_n < 0 ? -result_n : result_n);;
        if(result_n>result_d){
            x = (result_d < 0 ? -result_d : result_d);
        }
        if(result_n!=0 && result_d!=result_n && result_d%result_n==0){
            result_d=result_d/result_n;
            result_n=1;
            if(result_d<0){
                result_d*=-1;
                result_n*=-1;
            }
            result=result_n+"/"+result_d;
        }
        else if(result_n%result_d==0){
            result=String.valueOf(result_n/result_d);
        }
        else{
            for(int i=2;i<x;i++){
                if(result_n%i==0 && result_d%i==0){
                    result_n=result_n/i;
                    result_d=result_d/i;
                }
            }
            if(result_d<0){
                result_d*=-1;
                result_n*=-1;
            }
            result=result_n+"/"+result_d;
        }
        return result;
    }
}

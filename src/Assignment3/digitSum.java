import java.util.Scanner;
class digitSum{
    public static void main(String args[]){
        int a,b=0,sum=0;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        while(a>0){
            b=a%10;
            sum+=b;
            a=a/10;
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;
class bitPosition{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a,b,c=0;
        a=scan.nextInt();
        b=scan.nextInt();
        for(int i=0;i<3;i++){
                c=a%2;
            if(i==(b))
                {
                if(c==1){
        System.out.println("YES");
        }
	if(c==0){
        System.out.println("NO");
        }
         }
                a=a/2;
        }
    }
}

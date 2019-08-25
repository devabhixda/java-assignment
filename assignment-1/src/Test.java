import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int score[]=new int[5];
        for(int i=0;i<5;i++){
            score[i]=scan.nextInt();
            if(score[i]>=100||score[i]<=0){
                System.out.println("Invalid test score");
                i--;
            }
        }
        int total=0;
        for(int i=0;i<5;i++){
            total=total+score[i];
        }
        System.out.println("Average score is-"+(total/5));
        int max=0;
        for (int i = 1; i < score.length; i++){
            if (score[i] > max) {
                max = score[i];
            }
        }
            System.out.println("Highest score is- "+max);
    }
}

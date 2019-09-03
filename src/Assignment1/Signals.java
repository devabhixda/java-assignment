import java.util.Scanner;

public class Signals {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter size of signal-");
        int n=scan.nextInt();
        int signal[];
        signal=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter signal bit "+(i+1)+"-");
            signal[i]=scan.nextInt();
        }
        int smooth[];
        smooth=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                smooth[i]=(signal[i]+signal[i+1])/2;
            }else if(i==n-1){
                smooth[i]=(signal[i-1]+signal[i])/2;
            }else{
                smooth[i]=(signal[i-1]+signal[i]+signal[i+1])/3;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("Smoothed signal bit "+(i+1)+"-");
            System.out.println(smooth[i]);
        }
    }
}

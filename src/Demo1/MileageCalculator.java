package Demo1;

import java.util.Scanner;

public class MileageCalculator {
    int miles, gallons;
    static float t_mileage;
    public static void main(String args[]){
        System.out.print("Enter the number of trips taken- ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        MileageCalculator mileage = new MileageCalculator();
        for (int i=1;i<=x;i++){
            System.out.print("Enter number of miles for trip "+i+"- ");
            mileage.miles=scan.nextInt();
            System.out.print("Enter Gallons of fuel used for trip "+i+"- ");
            mileage.gallons=scan.nextInt();
            System.out.println("Mileage for trip "+i+" = "+calculator(mileage.miles,mileage.gallons)+" Miles/Gallon");
            System.out.println("Average mileage up-to trip "+i+" = "+t_mileage/i+" Miles/Gallon");
        }
    }
    public static double calculator(int a,int b){
        double trip;
        t_mileage+=(Double.valueOf(a)/b);
        trip=Double.valueOf(a)/b;
        return trip;
    }
}

import java.util.Scanner;

public class Player {
    int avg;
    String name,team;
    public Player(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter player's name- ");
        name=scan.nextLine();
        System.out.print("Enter player's avg score- ");
        avg=scan.nextInt();
        System.out.print("Enter player's team- ");
        team=scan.next();
    }
    public void name(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter player's name- ");
        name=scan.nextLine();
        System.out.println("Player's name-"+name);
    }
    public void average(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter player's avg score- ");
        avg=scan.nextInt();
        System.out.println("Player's average- "+avg);
    }
    public void team(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter player's team- ");
        team=scan.next();
        System.out.println("Player's team name- "+team);
    }
    public static void main(String args[]){
        Player player1=new Player();
        player1.name();
        player1.average();
        player1.team();
    }
}

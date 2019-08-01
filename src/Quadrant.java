import java.util.Scanner;
    class Quadrant {
        public void quadrant(int x, int y) {
            if(x==0&&y==0){
                System.out.println("Origin");
            }
            if(x>0){
                if(y>0){
                    System.out.println("First Quadrant");
                }
                else{
                    System.out.println("Fourth Quadrant");
                }
            }else if(y>0){
                System.out.println("Second Quadrant");
            }else  if(y<0){
                System.out.println("Third Quadrant");
            }
        }
        public static void main(String args[]) {
            Quadrant student = new Quadrant();
            Scanner scan=new Scanner(System.in);
            int x=scan.nextInt();
            int y=scan.nextInt();
            student.quadrant(x,y);
        }
    }

import java.util.Scanner;

class DateTest{
    private
        int month,date, year;
    private int getMonth(){
        return month;
    }
    private int getDate(){
        return date;
    }
    private int getYear(){
        return year;
    }
    private void setMonth(int month){
        this.month=month;
    }
    private void setDate(int date){
        this.date=date;
    }
    private void setYear(int year){
        this.year=year;
    }
     private DateTest(){

         Scanner scan = new Scanner(System.in);
        System.out.println("Enter Date-");
        date=scan.nextInt();
        setDate(date);

        System.out.println("Enter Month-");
        month=scan.nextInt();
        setMonth(month);

        System.out.println("Enter Year-");
        year=scan.nextInt();
        setYear(year);
        scan.close();

    }
    private void displayDate(){
        System.out.println("Date:-"+getMonth()+"/"+getDate()+"/"+getYear());
    }
    public static void main(String arg[])
    {
        DateTest date = new DateTest();
        date.displayDate();
    }

}
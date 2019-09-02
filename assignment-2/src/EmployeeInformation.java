import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class Employee{
	
	static Scanner keyboard = new Scanner(System.in);
	
	private String employeeName;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private int id;
	private int title;
	private int section;
	static private double Salary;
	private int date;
	private int month;
	private int year;
	private long differenceInYear;
	
	static private double hike;
	static private double leave;
	
	public double getHike() {
		return hike;
	}
	public void setHike(double hike) {
		Employee.hike = hike;
	}
	public double getLeave() {
		return leave;
	}
	public void setLeave(double leave) {
		Employee.leave = leave;
	}
	public int getTitle() {
		return title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String firstName, String lastName) {
		this.employeeName = firstName + " " +lastName ;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int i) {
		this.phoneNumber = i;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Employee.Salary = salary;
	}
	private void calculateYear(int date, int month, int year) {
		setDate(date);
		setMonth(month);
		setYear(year);
		LocalDate start = LocalDate.of( getYear() , getMonth() , getDate() ) ;
		LocalDate stop = LocalDate.now();
		 setDifferenceInYear(Period.between(start, stop).getYears());
	}
	
	public long getDifferenceInYear() {
		return differenceInYear;
	}
	public void setDifferenceInYear(long l) {
		this.differenceInYear = l;
	}
	double salaryOfEmployee(Employee employee) {
		System.out.println("Current Salary:"+getSalary());
		for(int i=1; i<=employee.getDifferenceInYear();i++) {

			System.out.println("Enter no. of leaves taken in this year from 1st Jan - 31st Dec of year: "+i);
			double leaves=keyboard.nextInt();
			
			if(leaves<=getLeave())
				setSalary(getSalary() + (getSalary() * getHike()/100));
			else
				setSalary( getSalary());
	}
		return getSalary()/12;

	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		
		this.date = date;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
	
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	Employee(){
		System.out.println("Enter First name");
		setFirstName(keyboard.next());
		System.out.println("Enter Last name");
		setLastName(keyboard.next());
		
		setEmployeeName(getFirstName(),getLastName());
		
		System.out.println("Enter Employee ID");
		setId(keyboard.nextInt());
		
		System.out.println("Enter Phone Number");
		setPhoneNumber(keyboard.nextInt());
		
		System.out.print("Enter Date of Joining(in DD/MM/YYYY)");
		calculateYear(keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt());
		
		
		System.out.println("Department of Company. \n 1. Manager. \n 2. Engineer. \n  3.Researcher. \n Select Department(1-3):");
		setSection(keyboard.nextInt());
		
		System.out.println("Title in Department");
		switch(getSection()) {
			case 1:
					System.out.println("1. HR. \n. 2. Technology. \n Enter(1-2) to select Title:");
					setTitle(keyboard.nextInt());
					break;
			case 2:
					System.out.println("1. Developer. \n. 2. Tester. \n 3. Architect. \n Enter(1-3) to select Title:");
					setTitle(keyboard.nextInt());
					break;
			case 3:
					System.out.println("1. Data Sciences. \n. 2. Analytics. \n 3. Cloud. \n Enter(1-3) to select Title:");
					setTitle(keyboard.nextInt());
					break;
				 
		}
	
		
	}
	public Employee(int i) {
		// TODO Auto-generated constructor stub
	}
}

class Manager extends Employee{
	Manager()
	{

		super(5);
		setSalary(12);
	}
}
class HR extends Manager{
	HR(){
		super();
		setLeave(2.5);
		setHike(20);
	}
}
class Technology extends Manager{
	Technology(){
		super();
		setLeave(2.5);
		setHike(30);
	}
}
class Engineer extends Employee{
	Engineer(){

		super(5);
	}
}
class Developer extends Engineer{
	Developer(){
		setSalary(10);
		setLeave(3);
		setHike(40);
	}
}
class Tester extends Engineer{
	Tester(){
		
		setSalary(6);
		setLeave(2.5);
		setHike(10);
	}
}
class Architect extends Engineer{
	Architect(){
		setSalary(12);
		setLeave(4);
		setHike(50);
	}
}
class Researcher extends Employee{
	Researcher(){

		super(5);
		setSalary(15);
	}
}
class DataScience extends Researcher{
	DataScience(){
		super();
		setLeave(4);
		setHike(60);
	}
}
class Analytics extends Researcher{
	Analytics(){
		super();
		setLeave(3);
		setHike(40);
	}
}
class Cloud extends Researcher{
	Cloud(){
		super();
		setLeave(3);
		setHike(40);
	}
}

class EmployeeInformation{
	public static void main(String args[]) {
		Employee employee = new Employee();
		switch(employee.getSection()) {
			case 1:	
					switch(employee.getTitle()) {
						case 1:	
							HR hr = new HR();
							System.out.println("New Salary:-"+hr.salaryOfEmployee(employee)+"Lakh per Month");
							break;
						case 2:	
							Technology technology = new Technology();
							System.out.println("New Salary:-"+technology.salaryOfEmployee(employee)+"Lakh per Month");
							break;
					}
					break;
			case 2:
					switch(employee.getTitle()) {
					case 1:	
						Developer developer = new Developer();
						System.out.println("New Salary:-"+developer.salaryOfEmployee(employee)+"Lakh per Month");
						break;
					case 2:	
						Tester tester = new Tester();
						System.out.println("New Salary:-"+tester.salaryOfEmployee(employee)+"Lakh per Month");
						break;
					case 3:
						Architect architect = new Architect();
						System.out.println("New Salary:-"+architect.salaryOfEmployee(employee)+"Lakh per Month");
						break;
					}
					break;
			case 3:
					switch(employee.getTitle()) {
					case 1:	
							Developer developer = new Developer();
							System.out.println("New Salary:-"+developer.salaryOfEmployee(employee)+"Lakh per Month");
							break;
					case 2:	
							Tester tester = new Tester();
							System.out.println("New Salary:-"+tester.salaryOfEmployee(employee)+"Lakh per Month");
							break;
					case 3:
							Architect architect = new Architect();
							System.out.println("New Salary:-"+architect.salaryOfEmployee(employee)+"Lakh per Month");
							break;
					}
					break;
				
			}
		}
}



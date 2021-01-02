package studentDatabaseApplication;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses;
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor to call students name and year
	public Student()
	{	Scanner sc = new Scanner(System.in);
		System.out.println("****************************");
		System.out.print("Enter your firstname : ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter your lastname : ");
		this.lastName = sc.nextLine();
		
		
		System.out.print("Choose Your Graduating Year : "
				+ "\n1 - 1st year\n2 - 2nd year \n3 - 3rd year\n4 - 4th year"
				+ "\nEnter your year : ");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
		
		//System.out.println("Your name :"+ firstName  + " "+ lastName + "\nPursuin Year of College :" + 
		//gradeYear + "\nStudent ID : " + studentId);
	}
	
	//Generate an ID
	private void setStudentID()
	{
		id++;
		this.studentId =gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll()
	{
		do 
		{
			System.out.print("Enter course to enroll(Q to quit) : ");
			Scanner sc = new Scanner(System.in);
			String course = sc.next();
			if(!course.equals("Q"))
			{
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else 
				break;
		}while(1 != 0);
		//System.out.println("Course Enrolled In : "+courses);
		//System.out.println(" "+ tuitionBalance);
	}
	
	//view balance
	public void viewBalance()
	{
		System.out.println("Total Tuition balance for all the courses are : "+ tuitionBalance);
	}
	
	//pay tuition
	public void payTuition()
	{	viewBalance();
		System.out.print("Enter your Payment Rs ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank You for Payment Rs " + payment);
		viewBalance();
	}
	
	
	//show status
	public String toString()
	{
		System.out.println("\n     **PERSONAL DETAILS**     ");
		return "Your Name               : "+ firstName.toUpperCase()  + " "+ lastName.toUpperCase() + 
			   "\nPursuin Year of College : "+ gradeYear + 
			   "\nStudent ID              : "+ studentId +
			   "\nCourse Enrolled In      :  " + courses.toUpperCase()+
			   "\nTuition Balance         : "+ tuitionBalance;
				
	}

}

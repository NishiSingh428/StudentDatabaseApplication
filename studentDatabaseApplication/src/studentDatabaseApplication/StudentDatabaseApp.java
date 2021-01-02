package studentDatabaseApplication;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		
		// ask how many students need to add in the database
		System.out.print("Enter number of students to enroll : ");
		Scanner sc = new Scanner(System.in);
		int noOFStudents = sc.nextInt();
		Student[] students = new Student[noOFStudents];
		
		//Create n no of students
		for(int n=0;n<noOFStudents;n++)
		{
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		for(int n=0;n<noOFStudents;n++)
		{
			System.out.println(students[n]); // calling toString method implicitly 
									  // no need to write st1.toString();
		}
		
	}

}

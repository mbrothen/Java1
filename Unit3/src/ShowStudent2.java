import java.util.Scanner;
public class ShowStudent2 {
	public static void main(String[] args)
	{
		Student firstStudent = new Student();
		//Get student info
		firstStudent= getData(firstStudent);
		//display details
		System.out.println("First student details:");
			System.out.println("ID Number: " + firstStudent.getIdNumber() + "\nCredit Hours: " + firstStudent.getCreditHours() + "\nTotal Points: " + firstStudent.getPoints() + "\nGPA: " + firstStudent.getGPA());

	}
	public static Student getData(Student s) 
	{
		int idNum;
		double creditHours;
		double points;
		Scanner keyboard = new Scanner(System.in);
/**	
		System.out.print("Enter ID number >> ");
		idNum = keyboard.nextInt();
		System.out.print("Enter creditHours >> ");
		creditHours = keyboard.nextDouble();
		System.out.print("Enter total pointss >> ");
		points = keyboard.nextDouble();
		keyboard.nextLine();
	
		s.setIdNum(idNum);
		s.setCreditHours(creditHours);
		s.setPoints(points);
		s.getGPA();*/
		return s;
	}

}

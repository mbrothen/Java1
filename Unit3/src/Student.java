
public class Student {
	private int idNumber;
	private double creditHours;
	private double points;
	private double gpa;
	
	public Student()
	{
		idNumber = 9999;
		creditHours = 3;
		points = 12;
	}
	public void setIdNum(int id)
	{
		idNumber = id;
	}
	public int getIdNumber() 
	{
		return idNumber;
	}
	public void setCreditHours(double cr)
	{
		creditHours = cr;
	}
	public double getCreditHours()
	{
		return creditHours;
	}
	public void setPoints(double pts)
	{
		points = pts;
	}
	public double getPoints()
	{
		return points;
	}
	public double getGPA()
	{
		gpa = points/creditHours;
		return gpa;
	}
}

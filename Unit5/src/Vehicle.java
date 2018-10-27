
public class Vehicle {
	public void print()
	{
		System.out.println("blank");
		int b = 8;
		int c = --b;
		System.out.println(c);
	}
	public void print(String name)
	{
		System.out.println("name");
	}
	public void print(String name, int cylinders)
	{
		System.out.println("Name cylinders");
	}
	public void print(int year, int horsepoer, String name)
	{
		System.out.println("year, horse, name");
	}
}

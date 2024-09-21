package IPT;
public class Day1Task extends Day1Sample {	//Child Class
	static {
		System.out.println("Static 1");
	}
	public void Task1 () {
		System.out.println("First Method");
		}
	public void Task2 () {
		System.out.println("Second Method");
		}
	{
		System.out.println("Instance 1");
	}
	Day1Task(){
		System.out.println("Constructor 1");
	}
	public static void main(String[] args) {
		Day1Task con = new Day1Task();
		con.Task2();
		con.Task3();
		con.Task1();
		
	}
}
class Day1Sample {     //Parent Class
	static {
		System.out.println("Static 2");
	}
	{
		System.out.println("Instance 2");
	}
	Day1Sample(){
		System.out.println("Constructor 2");
	}
	static {
		System.out.println("Static 3");
	}
	public void Task3 () {
		System.out.println("Third Method");
	}
}

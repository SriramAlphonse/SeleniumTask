package IPT;

public class Day1Constructor2 extends Day1Constructor3 {

	Day1Constructor2() {
		System.out.println("Consrtuctor 1");
	}

	static {
		System.out.println("Static 1");
	}
	{
		System.out.println("Instance 1");
	}

	public static void main(String[] args) {
		new Day1Constructor2(); // - it runs static methods in child class & then parent class, then
								// it completes the instance & constructor methods in child class and
								// then comes to parent class
	//new Day1Constructor3(); - it runs static methods in both class & then only Day1Constructor3
	
	}

}

class Day1Constructor3 {

	Day1Constructor3() {
		System.out.println("Consrtuctor 2");
	}

	static {
		System.out.println("Static 2");
	}
	{
		System.out.println("Instance 2");
	}
}
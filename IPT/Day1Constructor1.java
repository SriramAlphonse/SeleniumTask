package IPT;

public class Day1Constructor1 {

	Day1Constructor1() {
		System.out.println("Constructor");
		// for constructor method also we need to create object, then only it will execute the O/P
	}

	static {
		System.out.println("Static1");
	}

	static {
		System.out.println("Static2");
	}

	static {
		System.out.println("Static3");
	}

	{
		System.out.println("Instance");
		// instance block/only body - if we create object only it will execute the O/P
	}

	{
		System.out.println(10*10);
		// instance block/only body - if we create object only it will execute the O/P
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Day1Constructor1();
		
		//first the static method will run
		//the the instance block and then only constructor method

	}

}

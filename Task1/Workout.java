package Task1;

public class Workout {

	
	static String b = "Hi";
	public void addition () {
		int a = 40;
		a++;
		System.out.println(a);
	}
	
	public void addition (String name) {
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Workout w1 = new Workout();
       w1.addition();
       w1.addition("Sriram");

       System.out.println(b);
	}

}

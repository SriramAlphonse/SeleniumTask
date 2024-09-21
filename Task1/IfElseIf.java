package Task1;

public class IfElseIf {

	private void controlstatement () {
	String Name = "ABC";
	int Age =30;
	char Grade = 'A';
	
	Age++;
	
	if (Name == "ABC") {
		System.out.println ("Your Namecode is: ABC");
	}
	else if (Name == "DEF") {
		System.out.println ("Your Namecode is: DEF");
	}
	
	if (Age == 31) {
		System.out.println ("Your Age is: 31");
	}
	else if (Age == 40) {
		System.out.println ("Your Age is: 40");
	}
	
	if (Grade == 'A') {
		System.out.println ("Your Grade is: A");
	}
	else if (Grade == 'B') {
		System.out.println ("Your Grade is: B");
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElseIf personaldetails = new IfElseIf ();
              personaldetails.controlstatement();
	}

}

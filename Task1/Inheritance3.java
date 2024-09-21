package Task1;

public class Inheritance3 extends Inheritance2{
	
    public void Orange1() {
    	
		System.out.println("Price of Orange1 type is 150");
	}
	
    public void Orange2() {
		
		System.out.println("Price of Orange2 type is 200");
	}

	public static void main(String[] args) {
		Inheritance3 j = new Inheritance3();
		j.Mango1();
		j.Mango2();
		j.Apple1();
		j.Apple2();
		j.Orange1();
		j.Orange2();
		
	}

}
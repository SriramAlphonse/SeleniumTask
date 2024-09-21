package Task1;

public class Inheritance2 extends Inheritance1{

    public void Mango1() {
    	
		System.out.println("Price of Mango1 type is 80");
	}
	
    public void Mango2() {
		
		System.out.println("Price of Mango2 type is 100");
	}

	public static void main(String[] args) {
		Inheritance2 j = new Inheritance2();
		j.Mango1();
		j.Mango2();
		j.Apple1();
		j.Apple2();
	}

}

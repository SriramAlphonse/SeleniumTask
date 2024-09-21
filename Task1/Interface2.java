package Task1;

public class Interface2 implements Interface1{

	

	@Override
	public void Dell(String price) {
		// TODO Auto-generated method stub
		System.out.println("The laptop rate is " + price);
	}

	@Override
	public void Acer(String price) {
		// TODO Auto-generated method stub
		System.out.println("The laptop rate is " + price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Interface2 i1 = new Interface2();
       i1.Acer("50000");
       i1.Dell("60000");
	}
}

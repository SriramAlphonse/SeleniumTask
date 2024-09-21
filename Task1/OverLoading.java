package Task1;

public class OverLoading {
	
public void Terminal(String name) {
		
	System.out.println(name);
	
	}
	
	public void Terminal(int a, String b) {
		
	
		System.out.println("Terminal " + a + " " +  "is " + b);
	}
	
   public void Terminal(String b, float c) {
		
		
		System.out.println("Terminal" + b + " " + "length is " + c);
	}
	
   public void Terminal(int a, int b, int c, String d) {
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading T1 = new OverLoading();
		T1.Terminal("Terminal 1");
		T1.Terminal("Terminal 2");
		T1.Terminal("Terminal 3");
		T1.Terminal(4, "small");
		T1.Terminal("ditance", 85f);
		T1.Terminal(0, 0, 10, null);

	}

}

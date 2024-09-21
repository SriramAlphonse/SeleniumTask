package IPT;

public class Day1basics {

	public static void main(String[] args) {
		
		int a = 'C';
		char b = 90;
		System.out.println(a);
		System.out.println(b);
		System.out.println(5+5);
		System.out.println(5-7);
		System.out.println(5+'V');// V- Ascii Value
		System.out.println(15+"V");
		System.out.println(5+5+"V");
		System.out.println(15/5+"V"+5);
		System.out.println(5-5+"V"+5+5);
		System.out.println(5*5+"V"+"V"+5+5);
		
		int c = 100;
		c++;      // increment
		System.out.println(c);
		
		int d = 100;
		d=d++; //d value assigned in the first d, so it will print as 100
		System.out.println(d);
		
		int e = 200;
		byte f = 125;
		f=(byte)f;
		System.out.println("the value of f is " + + f);
		f=(byte)e;   // from -128 to 127
		e=(int)f;
		System.out.println("the value of f is " + + f);
		System.out.println("the value of e is " + + e);

		byte h = (byte) 129; //casting
		System.out.println(h);
		
		int i = 250;
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toOctalString(i));
	}

}

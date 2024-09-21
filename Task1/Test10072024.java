package Task1;

public class Test10072024 {
	
	public void literal() {
		
		int [] numbers = {5,23,63,5};
		System.out.println("{");
		for (int i=0; i<numbers.length-1; i--) {
			System.out.println(numbers[i]);
			if (i==numbers.length-1) {
				System.out.println(",");
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test10072024 O = new Test10072024 ();
     O.literal();
     }

}

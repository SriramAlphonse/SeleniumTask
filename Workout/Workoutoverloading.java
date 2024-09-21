package Workout;

public class Workoutoverloading {
	
	public void Train1 (String name){
		System.out.println(name);
	}
	
    public void Train1 (int length){
    	System.out.println(length);
	}
    
    public void Train1 (int a, int b){
    
    	int c = a/b;
    	System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Workoutoverloading T = new Workoutoverloading();
		T.Train1("Pallavan Express");
		T.Train1("Pandiyan Express");
		T.Train1(52);
		T.Train1(20, 10);
	
	}

}

package Task1;

public class ForLoopMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++)
	    {
	    	for (int j=1; j<=i; j++) {
	    		
	    		System.out.print(j);
	    }
	        	System.out.println();
		    }
		System.out.println("*******************");
		
		for (int i=5; i>=1; i--)
	    {
	    	for (int j=5; j>=i; j--) {
	    		System.out.print(j);
	    }
	        	System.out.println();
		    }
		System.out.println("*******************");
		
		
		for (int i=1; i<=5; i++)
	    {
	    	for (int j=5; j>=i; j--) {
	    		System.out.print(j);
	    }
	       	System.out.println();
		    }
		System.out.println("*******************");
		
		for (int i=5; i>=1; i--)
	    {
	    	for (char j='a'; j<=i; j++) {
	    		System.out.print(j);
	    }
	       	System.out.println();
		    }
		System.out.println("*******************");
		
		
	}

}

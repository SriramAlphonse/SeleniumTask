package Task1;

import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver

		
	ArrayList <String> listofdata = new ArrayList<String>();
	
	listofdata.add("Pencil");
	listofdata.add("Pen");
	listofdata.add("Eraser");
	listofdata.add("Sharpner");
	listofdata.add("Sketch");
	listofdata.add("Sharpner");
	listofdata.add(null);
	
	// int size = listofdata.size();
	System.out.println(listofdata.size());         //size
	System.out.println(listofdata);               //list of data
	System.out.println(listofdata.add("Duster")); //add  (return type - boolean)
	System.out.println(listofdata);               //list of data after add
	System.out.println(listofdata.remove(5));     // remove
	System.out.println(listofdata);                //list of data after remove
	System.out.println(listofdata.get(2));          // get
	System.out.println(listofdata.set(4, "Marker")); //set
	System.out.println(listofdata);               //list of data after set
	listofdata.clear();                           //clear
	System.out.println(listofdata);               //after clear action
	System.out.println(listofdata.size());       //after clear action
	
	}

}

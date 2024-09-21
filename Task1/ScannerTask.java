package Task1;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
        System.out.println("Enter your father name");
		String fathername = sc.next();
		fathername = fathername + sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Enter your weight");
		float weight = sc.nextFloat();
		
		System.out.println("Enter your birth year");
		short birthyear = sc.nextShort();
		
		System.out.println("Enter your communiction address");
		String address = sc.nextLine();
		address = address + sc.nextLine();
		
		System.out.println("Enter your phone number");
		long number = sc.nextLong();
		
		System.out.println();
		
		System.out.println("Enter your name :" + name);
		System.out.println("Enter your father name :" + fathername);
		System.out.println("Enter your age :" + age);
		System.out.println("Enter your weight :" + weight);
		System.out.println("Enter your birth year :" + birthyear);
		System.out.println("Enter your communiction address :" + address);
		System.out.println("Enter your phone number:" + number);
		
		//fathername = fathername + task.nextLine();
		
		//System.out.println("sriram" + name + "Alphonse" + fathername + "fathername");

	}

}

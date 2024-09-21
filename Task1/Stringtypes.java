package Task1;

public class Stringtypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "I love my country";
		String s2 = "I love my parents";
		String s3 = "I LOVE MY PARENTS";
		String s4 = "";
		String s5 = "   INDIA     ";
		String s6 = "a b c d e f g"; 
		//s1.length(); 
		System.out.println(s1.length());   //1.length
		System.out.println(s2.contains("my"));    //2.contains
		System.out.println(s1.toUpperCase());    //3.to upper case
		System.out.println(s2.toLowerCase());    //4.to lower case
		System.out.println(s1.equals(s2));       //5.equals
		System.out.println(s2.equalsIgnoreCase(s3));  //6.equals ignore case
		System.out.println(s1.startsWith("I"));       //7.starts with
		System.out.println(s3.endsWith("ry"));        //8.ends with
		System.out.println("#######index of########");              
		System.out.println(s1.indexOf("v"));         //9.index of
		System.out.println(s1.indexOf(" "));         
		System.out.println("########last index of#########");
		System.out.println(s2.lastIndexOf("y"));     //10.last index of
		System.out.println("#########char at##########");
		System.out.println(s2.charAt(3));            //11.char at
		System.out.println("########replace#########");
		System.out.println(s2.replace("parents", "friends"));//12.replace
		System.out.println("########substring#######");
		System.out.println(s3.substring(4));              //13.substring
		System.out.println(s3.substring(4,8));            
		System.out.println("#######empty#######");
		System.out.println(s3.isEmpty());                 //14.empty
		System.out.println(s4.isEmpty());
		System.out.println(s5.trim());                  //15.trim
        System.out.println(s1.concat(s2));              //16.concat
        String[] words =s6.split("\\s",5);              //17.split
        for (String w:words) {
        	System.out.println(w);
        }
	}

} 
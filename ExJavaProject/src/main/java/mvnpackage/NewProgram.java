package mvnpackage;


public class NewProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		System.out.println(s);
		String a=new String("Hello world");
		System.out.println(a);
		char arr[]= {'a','b','c','d'};
		String s1=new String(arr); //convert char array to string	
		System.out.println(s1);
		System.out.println(s1.length());//to find length of the string
		System.out.println(s1.charAt(1)); //charAt-to return string at particular index
		//concat()-to combine two strings
		System.out.println(s.concat(" "+a));
		//contains-check whether a word is present in a string
		System.out.println(a.contains("world"));
		System.out.println(a.contains("hi"));
		String s2="java";
		String s3="java";
		String s4="Java";
		String s5="selenium";
		String s6="SELENIUM";
		String s7="";
		//equals-to check two strings are equal or not
		System.out.println("***********************");
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s5));
		//equalsIgnoreCase()-
		System.out.println(s2.equalsIgnoreCase(s4));
		//toUpperCase
		System.out.println(s2.toUpperCase());
		//toLowerCase
		System.out.println(s6.toLowerCase());
		//isEmpty
		System.out.println(s2.isEmpty());
		System.out.println(s7.isEmpty());
		//valueOf()-to convert any datatype value to string
		int f=90;
		String s8=String.valueOf(f);
		System.out.println(s8);
		//== - to compare
		System.out.println(s2==s3);
		String a1=new String("java");
		System.out.println(s2==a1);
		
		StringBuffer sb=new StringBuffer("Hello world");
		System.out.println(sb);
		
		StringBuilder sa=new StringBuilder(" welcome");
		System.out.println(sa);
		
		//append-to add another string to the last of the given string
		sa.append(" reenu");
		System.out.println(sa);
		//insert-insert an element based on the index
		sa.insert(0, "hi ");
		System.out.println(sa);
		//replace-replace the value based on the starting and ending index
		sa.replace(3, 3, "it's me");
		System.out.println(sa);
		//reverse-to reverse the string
		//sa.reverse();
		//System.out.println(sa);
		//delete-to delete specific part of a string
		sa.delete(3, 6);
		System.out.println(sa);

	}

}

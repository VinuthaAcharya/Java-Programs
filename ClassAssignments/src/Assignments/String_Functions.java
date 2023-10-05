package Assignments;
//String Functions
public class String_Functions 
{
	public static void main(String[] args) 
	{
		String a="Vinutha";
		String b="Tanush";
		String c="India";
		String d="India is my Country";
		String e=" India is my Country ";
		String f="";
		String g="Software Testing";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf('h'));
		System.out.println(g.substring(2));
		System.out.println(g.substring(1,3));
		System.out.println(e.trim());
		System.out.println(a.contains("z"));
		System.out.println(a.isEmpty());
		System.out.println(a.matches(b));
		System.out.println(a.concat(" ").concat(b));
	}

}


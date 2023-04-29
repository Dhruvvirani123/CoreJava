package CoreJava;

public class StringDemo {
	public static void main(String[] args) {
		
		String name = "Dhruv";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.substring(4));		
		//SubString 3 means uv print  
		//"unhappy".substring(2) returns "happy"
		//"Harbison".substring(3) returns "bison"
		// "emptiness".substring(9) returns "" (an empty string)
		
		System.out.println(name.substring(2,4));
//		"hamburger".substring(4, 8) returns "urge"
//		"smiles".substring(1, 5) returns "mile"

		System.out.println(name.replace("D", "V	")); //First Perametter Old And Second Perametter is New char
//		Replaces each substring of this string that matches the literal targetsequence with 
//		the specified literal replacement sequence. Thereplacement proceeds from the beginning 
//		of the string to the end, for example, replacing "aa" with "b" in the string "aaa" will result
//		in"ba" rather than "ab".
		
		System.out.println(name.startsWith("d"));  //This String Starrt D so true d so False
		System.out.println(name.endsWith("v"));  //This String End v so true u so False
		
		System.out.println(name.charAt(2));  //Char Index 
		
		System.out.println(name.indexOf("ru"));  //Index Number in first console run
		
		System.out.println("I am Dhruv \"Virani");
		
		
		String nontirmmedstring = "    Dhruv      ";
		System.out.println(nontirmmedstring);
		System.out.println(nontirmmedstring.trim());
	}
}

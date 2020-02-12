//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		if (isVowel(a.charAt(0)) || isVowel(a.charAt(a.length()-1))) {
			return "yes";
		}
		else {
			return "no";
		}
	}
   public static boolean isVowel(char b) {
       return (b== 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U');
}
}
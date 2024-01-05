/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
		String LowerCaseString = "";
		char c;
		for (int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);
			if ((int) c >= 65 && (int) c <= 90)
			{
				c = (char) ((int) c + 32);
			}
			LowerCaseString += c;
		}
        return LowerCaseString;
    }
}

/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String UniqueCharsString = "";
		char c;
		for (int i = 0; i < s.length(); i++)
		{
			if (UniqueCharsString.indexOf(s.charAt(i)) < 0 || s.charAt(i) == ' ')
			{
				UniqueCharsString += s.charAt(i);
			}
		}
        return UniqueCharsString;
    }
}

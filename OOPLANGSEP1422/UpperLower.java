
/**
 * Write a description of class UpperLower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UpperLower
{
    public static void main(String [] args)
    {
        String aString = "Welcome to Holy Angel University";
        System.out.println("The String: " + aString);
        
        System.out.println("Index of 'Holy': " + aString.indexOf("Holy"));
        
        aString.trim();
        System.out.println("Uppercased: " + aString.toUpperCase());
        System.out.println("Lowercased: " + aString.toLowerCase());
        System.out.println("Length : " + aString.length());
        
        System.out.println("**********");
        
        String myString = "Hello";
        System.out.println("String: " + myString);
        
        char result = myString.charAt(3);
        
        System.out.println("CharAt: " + result);
        System.out.println("EndsWith Method: " + myString.startsWith("H"));
        
        System.out.println("ReplaceMethod: " + myString.replace("ll", "ww"));
    }
}

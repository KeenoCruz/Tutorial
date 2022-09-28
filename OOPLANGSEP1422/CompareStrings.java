
/**
 * Write a description of class CompareStrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CompareStrings
{
    public static void main(String [] args)
    {
        String aName = "Keeno";
        String anotherName;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name > ");
        anotherName = input.nextLine();
        
        if (aName.equalsIgnoreCase(anotherName))
        System.out.println(aName + " equals " + anotherName);
        else
        System.out.println(aName + " does not equal " + anotherName);
    }
}

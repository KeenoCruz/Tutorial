
/**
 * Write a description of class IgnoreCase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IgnoreCase
{
    public static void main(String [] args)
    {
        String genshinName = "Yoimiya";
        String gName = "yOIMIYA";
        
        if(genshinName.equalsIgnoreCase(gName))
        System.out.println(genshinName + " is the same as " + gName);
        else
        System.out.println(genshinName + " is not the same as " + gName);
    }
}

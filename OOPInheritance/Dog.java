
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    static String breed = "German Shepherd";
    static int tagNo = 5;
    static String color = "Brown";
    
    public Dog()
    {
        PrintInfo();
    }
    public static void PrintInfo()
    {
        System.out.println("Breed: " + breed);
        System.out.println("Tag No.: " + tagNo);
        System.out.println("Color: " + color);
    }
}

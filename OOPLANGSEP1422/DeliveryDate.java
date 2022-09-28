
/**
 * Write a description of class DeliveryDate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.time.*;
import java.util.Scanner;
public class DeliveryDate
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        LocalDate orderDate;
        
        int mo;
        int day;
        int year;
        final int WEEKS_FOR_DELIVERY = 4;
        
        System.out.println("Enter order month: ");
        mo = input.nextInt();
        System.out.println("Enter order day: ");
        day = input.nextInt();
        System.out.println("Enter order year: ");
        year = input.nextInt();
        orderDate = LocalDate.of(year, mo, day);
        
        System.out.println("Order date is " + orderDate);
        System.out.println("Delivery date is " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));
    }
}

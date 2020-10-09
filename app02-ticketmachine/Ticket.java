// Importing Date type from package
import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author Jason Huggins
 * @version 09/10/2020
 */
public class Ticket
{
   // The ticket's destination
   private String destination;
   // The ticket's date and time when issued
   private Date issueDateTime;
   // The ticket's price
   private int price;
    
   /**
    * Constructor for objects of class Ticket setting the destination
    * and price, where the date shows the current system 
    * date and time.
    */
   public Ticket(String givenDestination, int givenPrice)
   {
       destination = givenDestination;
       price = givenPrice;
       issueDateTime = new Date();
   }
   
   /**
    * Prints the ticket to the output terminal.
    */
   public void print()
   {
       System.out.println("Ticket: " + destination + "\nPrice: " + 
           "\nIssued: " + issueDateTime);
   }
}

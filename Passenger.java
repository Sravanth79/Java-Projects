package Ticket_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.jar.Attributes.Name;

public class Passenger {
   private String name ;
   private int age;
   Random random = new Random();
   private long phNumber =random.nextLong();
   private String gender;
   private Ticket t;
   private ArrayList<Ticket> ticket = new ArrayList();
 
//   add
   public void bookTicket(Ticket t) 
   {
	  ticket.add(t);
	  System.out.println("Booked ticket succesfully");
   }
    //display
   public void display() {
	t.display();
   }
   // 
   public void searchTicketBasedOnBoardPoint(String boardingPoint) {
	   boolean isValid =false;
	   if (ticket.isEmpty()) 
	   {
		    System.out.println("Ticket not booked");
	    }
	   else 
	    {
		   for (Ticket t : ticket) 
		   {
			if (t.getBoardingPoint().equalsIgnoreCase(boardingPoint)) 
			{
				System.out.println("Ticket was booked ------\n ");
				t.display();
				isValid =true;
			}
		   }
	     }
	   if (isValid == false) 
	   {
		System.out.println("enter a valid boarding Point");
	   }
   }
   // update ---
   public void changeDestinationBasedOnId(int id)
   {
	   boolean isValid =false;
			if (ticket.isEmpty()) {
				System.out.println("Ticket not booked");
			}
			else {
				for (Ticket t : ticket) {
					if (t.getTicketId()==id) {
						isValid = true;
						t.setDestinationPoint("bombay");
						System.out.println("Destination changed to bombay---");
					}
				}
			}
		 if (isValid == false) 
		 {
				System.out.println("enter a valid boarding Point");
		 }
  }
   public void removeTicket(int id) {
	   boolean isValid =false;
	  Iterator<Ticket> ite  = ticket.iterator() ;
	  while(ite.hasNext()) {
		  Ticket t =ite.next();
		  if(t.getTicketId()==id) {
			  ticket.remove(id);
			  isValid = true;
			  System.out.println("ticket was cancelled ------");
		  }
	  }
	  if (isValid == false) 
	  {
			System.out.println("enter a valid ticket id");
	  }
		 
  }
   
}

package Ticket_project;
import java.util.Random;
public class Ticket {
  private int ticketId;
  private int ticketCost;
  private String boardingPoint;
  private String destinationPoint;
  Random r = new Random();
@Override
public String toString() {
	return "ticketId= " + ticketId + "\n ticketCost=" + ticketCost + "\n boardingPoint=" + boardingPoint
			+ "\n destinationPoint=" + destinationPoint;
 }

public Ticket( int ticketCost, String boardingPoint, String destinationPoint) {
	this.ticketId  = r.nextInt(123456);
	this.ticketCost = ticketCost; 
	this.boardingPoint = boardingPoint;
	this.destinationPoint = destinationPoint;
}

public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) 
{ //no use
	this.ticketId = ticketId;
}
public int getTicketCost() {
	return ticketCost;
}
public void setTicketCost(int ticketCost) 
{
	this.ticketCost = ticketCost;
}
public String getBoardingPoint() 
{
	return boardingPoint;
}
public void setBoardingPoint(String boardingPoint) 
{
	this.boardingPoint = boardingPoint;
}
public String getDestinationPoint() 
{
	return destinationPoint;
}
public void setDestinationPoint(String destinationPoint) 
{
	this.destinationPoint = destinationPoint;
}

  public void display()
  {                                                       
	System.out.println("Ticket id :"+getTicketId());
	System.out.println("Ticket cost :"+getTicketCost());
	System.out.println("Ticket BoardingPoint :"+getBoardingPoint());
	System.out.println("Ticket Destination point :"+getDestinationPoint());
  }
}
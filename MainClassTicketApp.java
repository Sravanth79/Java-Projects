package Ticket_project;
import java.util.Scanner;
public class MainClassTicketApp
{
	public static void main(String[] args) 
	{
	    Passenger passenger = new Passenger();
		Scanner sc = new Scanner(System.in);
		boolean isStart = true;
		while(isStart)
		{
			System.out.println("enter the choice :::::: \n1. enter bookTicket \n2. display ticket \n3.searchTicketBasedOnBoardPoint \n4.changeDestinationBasedOnId \n5.removeTicket \n6. Exit from app ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
			{
				System.out.println("Enter the TicketCost");
				int cost = sc.nextInt();
				System.out.println("Enter the boarding point ");
				String boardPoint = sc.next();
				System.out.println("Enter the destination point ");
				String destination = sc.next();
				passenger.bookTicket(new Ticket(cost,boardPoint,destination));
			}
			break;
			case 2 :
			{
				passenger.display();
			}
			break;
			case 3 :{
				System.out.println("enter boarding point ");
				String str = sc.next();
				passenger.searchTicketBasedOnBoardPoint(str);
			}
			break;
			case 4:
			{
				System.out.println("Enter id for change destination");
				int id = sc.nextInt();
				passenger.changeDestinationBasedOnId(id);
			}
			break;
			case 5 :
			{
				System.out.println("Enter id to cancel ticket -- ");
				int id = sc.nextInt();
				passenger.removeTicket(id);
				
			}
			break;
			case 6 :
			{
				isStart =  false ;
				System.out.println("Thank you Visit again");
				
			}
			break;
			default:
				System.err.println("invlid choice entered");
			}
		}
		}
	}

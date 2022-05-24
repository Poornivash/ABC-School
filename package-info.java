package train;
import java.util.Scanner;

public class TicketCharge {
	public static void main(String[] args) {
		int a=150,b=200,c=120,d=70;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("               Welcome to Ticket Charge       ");
		System.out.println("Enter the number of person between below 3 is FREE ");
		System.out.println("Enter the number of person over 55:  ");
		int p=sc.nextInt();
		p=a*p;
		System.out.println("Enter the number of person between 21 to 54:  ");
		int q=sc.nextInt();
		q=b*q;
		System.out.println("Enter the number of person between 13 to 20:  ");
		int r=sc.nextInt();
		r=c*r;
		System.out.println("Enter the number of person between 3 to 12:  ");
		int s=sc.nextInt();
		s=d*s;
		
		int amount = p+q+r+s;
		int total=amount*(3/100);
		int totalCharge = amount+total;
		System.out.println("After calculating 3% of tax: "+totalCharge);
	}
	

}

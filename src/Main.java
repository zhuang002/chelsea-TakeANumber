import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ticketNumber = sc.nextInt();
		sc.nextLine();
		int taken = 0;
		int served = 0;
		String action = sc.nextLine();
		while (!action.equals("EOF")) {
			if (action.equals("TAKE")) {
				ticketNumber++;
				if (ticketNumber>999) {
					ticketNumber = 1;
				}
				taken++;
			} else if (action.equals("SERVE")) {
				served++;
			} else if (action.equals("CLOSE")) {
				System.out.println(taken+" "+(taken-served)+" "+ticketNumber);
				taken = 0;
				served = 0;
			} else {
				System.out.println("Error: unknown action.");
			}
			action=sc.nextLine();
		}
	}

}

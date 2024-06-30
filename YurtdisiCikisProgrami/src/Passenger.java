import java.util.Scanner;

public class Passenger implements YurtDisiKurallari {

	public boolean politicialBan;
	public boolean visaStatus;
	public int fees;
	
	public Passenger() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the fee you pay?");
		fees = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Do you have any politicial ban?(yes or no)");
		String answer2 = scanner.nextLine();
		
		if(answer2.equals("yes")) {
			politicialBan = true;	
		}
		else {
			politicialBan = false;
		}
		
		System.out.println("Do you have the visa?(yes or no)");
		String answer3 = scanner.nextLine();
		
		if(answer3.equals("yes")) {
			visaStatus = true;
		}
		else {
			visaStatus = false;
		}
		
	}
	
	@Override
	public boolean controlAbroadFees() {
		if(this.fees < 100) {
			System.out.println("Your fees is not enough! Please, to complete it! ");
		    return false;
		}
		else {
			System.out.println("Your fees is okey! ");
			return true;
		}
		
	}
	
	@Override
	public boolean controlPoliticialBan() {
		if(politicialBan = true) {
		   System.out.println("You have a politicial ban! You cannot go to the abroad.");
		return false;
		}
		else {
			System.out.println("You do not have any politicial ban :)");
			return true;
		}
	}
	@Override
	public boolean controlVisaStatus() {
		if(visaStatus = true) {
			System.out.println("You don't have a visa to the country you want to go.");
			return false;
		}
		else {
			System.out.println("You have a visa :)");
		return true;
		}
	}
	
	
	
	
	
}

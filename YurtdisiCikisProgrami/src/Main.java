
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
    System.out.println("Welcome to Sabiha Gökçen airport! ");
    
    String conditions = "You musn't have any bans."
    		+ "You have to pay the 100 TL fee in full."
    		+ "You have a visa to the country you are traviling to.";

		String message = "You must meet all the above conditions.";
		
		while(true) {
			System.out.println("**************************");
			System.out.println(conditions);
			System.out.println("**************************");
			System.out.println(message);
			
			Passenger passenger1 = new Passenger();
			
			System.out.println("Controlling to the abroad fee...");
			Thread.sleep(3000);
			
			if(passenger1.controlAbroadFees() == false) {
				System.out.println(message);
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		

	}

}

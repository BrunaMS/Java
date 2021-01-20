
public class testReferences {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 300;
		
		System.out.println("First Account balancy: " + firstAccount.balance);
		
		Account secondAccount = firstAccount; // It's like a pointer
		secondAccount.balance = 550;
		System.out.println(firstAccount.balance); // Same value as in the second account
		
		
	}
}

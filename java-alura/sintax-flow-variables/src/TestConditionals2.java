
public class TestConditionals2 {
	public static void main(String[] args) {
		System.out.println("Testing conditionals");
		
		int age = 15;
		int anotherAge = 25;
		int qntdPeople = 2;
		boolean accompanied = false;
		
		if(qntdPeople > 1) {
			accompanied = true;
		}
		
		if(age >= 18 || (qntdPeople > 1 && anotherAge >= 18)) {
			// one scope
			int randomVar = 10;
			System.out.println("You're more than 18 years or you're accompanied (I don't know)");
			System.out.println("Welcome");
		}
		else {
			// another scope
			int randomVar = 20;
			System.out.println("Unfortunately you aren't more than 18 years");	
		}
		
		if(accompanied) {
//			System.out.println(randomVar); // Scope test --> Error
			System.out.println("Now I know you are with someone");
		}
	}
}

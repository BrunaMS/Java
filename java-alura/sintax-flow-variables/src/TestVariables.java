
public class TestVariables {
	public static void main(String[] args) {
		int age = 23;
		double height = 1.53;
		double division;
		
		System.out.println("Hello new test");

		System.out.println("Modified age: ");
		System.out.println(age + 5);
		System.out.println(age / 2);
		System.out.println(age * 2);
		
		System.out.println("Original age: " + age + " years old.");
		System.out.printf("Height: %.2f meters\n", height);
		
		division = age * height / 2;
		System.out.printf("Random Division (double): %.2f\n", division);
		System.out.printf("Random Division (int): %d\n", age / 2);
	}
}

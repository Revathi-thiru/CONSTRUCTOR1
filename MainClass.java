package constructor;

public class MainClass {
	
	public static void main(String[] args) {
		
		PassPercentage passPercentage= new PassPercentage();
		Student student= new Student("Arun", 60, 40, 84);
		System.out.println(student.theoryPassed);
		System.out.println(student.practicalPassed);
	MainClass mainClass= new MainClass();
	int firstNumber=5;

	mainClass.addition(firstNumber, 7);
		
		
	}
	
	public Integer addition(int firstNumber, int secondNumber) {
		firstNumber= firstNumber;
		secondNumber= secondNumber;
		return firstNumber+secondNumber;
	}

}

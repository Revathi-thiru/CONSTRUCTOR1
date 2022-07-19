package constructor;

public class Student {
	String name;
	
	boolean theoryPassed;
	
	boolean practicalPassed;
	
	boolean attendanceCleared;
	
	public Student(String name, int theoryMarks, int praticalMarks, int attendance, PassPercentage passPercentage){
		this.name= name;
		this.theoryPassed= theoryMarks >= passPercentage.theory;
		this.practicalPassed= praticalMarks>=passPercentage.practical;
	}
	
	
	

}

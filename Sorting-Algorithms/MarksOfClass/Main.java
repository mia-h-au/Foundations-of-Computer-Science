import java.io.File;
import java.util.Scanner;

// Question 9
public class Main {
	
	// Question 11
	// https://www.dreamincode.net/forums/topic/72069-read-text-file-into-array/
	/*Define method with: 
	input: a file name 
	output array of students*/
	private static Student[] readData(String filename) {
		Student[] students = new Student[20];
		String[] name = new String[20];
		int[] physic = new int[20];
		int[] chemistry = new int[20];
		int[] math = new int[20];

		try {
			Scanner input = new Scanner (new File (filename));

			int i = 0;
			while (input.hasNext()) {
				name[i] = input.next();
				physic[i] = input.nextInt();
				chemistry[i] = input.nextInt();
				math[i] = input.nextInt();

				students[i] = new Student(name[i], physic[i], chemistry[i], math[i]);
								
				i++;
			}			
		}

		catch (Exception e) {
			System.out.println("Exception occured.");
		}

		return students;
	}

	// Question 13
	// Define method to print the students
	public static void printStudents(Student[] students) {
		System.out.println("Student  AverageScore  Physic  Chemistry  Maths");
		for (int i = 0; i < students.length; i++) {		
			// https://stackoverflow.com/questions/699878/is-there-an-easy-way-to-output-two-columns-to-the-console-in-java
			// https://www.homeandlearn.co.uk/java/java_formatted_strings.html
			System.out.printf("%-8s %-13.1f %-7d %-10d %-7d\n", students[i].name, students[i].average, students[i].physic, students[i].chemistry, students[i].math);
			// System.out.println(students[i].name + "  " + Math.round(students[i].average * 10) / 10.0f + "  " + students[i].physic + "  " + students[i].chemistry + "  " + students[i].math);
			// Format average score - round up to 1 decimal place		
			// https://stackoverflow.com/questions/22186778/using-math-round-to-round-to-one-decimal-place
			// For ref only: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java	
		}
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		printStudents(s.sortStudents(readData("students.txt")));

	}
}
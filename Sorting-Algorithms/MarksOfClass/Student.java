// Question 10
public class Student {

	String name;
	int physic, chemistry, math;
	float average;

	// Mutators
	public void setName(String tmpName) {
		this.name = tmpName;
	}

	public void setPhysic(int tmpPhysic) {
		this.physic = tmpPhysic;
	}

	public void setChemistry(int tmpChemistry) {
		this.chemistry = tmpChemistry;
	}

	public void setMath(int tmpMath) {
		this.math = tmpMath;
	}

	public void setAverage(float tmpAverage) {
		this.average = tmpAverage;
	}

	// Accessors
	public String getName() {
		return this.name;
	}

	public int getPhysic() {
		return this.physic;
	}

	public int getChemistry() {
		return this.chemistry;
	}

	public int getMath() {
		return this.math;
	}

	public float getAverage() {
		return this.average;
	}

	// No-argument Constructor
	public Student() {
		setName("UnknownName");
		setPhysic(0);
		setChemistry(0);
		setMath(0);
		setAverage(0.0f);
	}

	// Parametric Constructor
	public Student(String name, int physic, int chemistry, int math) {
		setName(name);
		setPhysic(physic);
		setChemistry(chemistry);
		setMath(math);

		// Calculate average score
		average = (float) (physic + chemistry + math) / 3;
	}

	// Question 12
	// Define method to sort students
	// using Bubble Sort
	public static Student[] sortStudents(Student[] students) {
		int n = students.length;
		for (int i = 0; i < (n - 1); i++) {
			for (int j = (i + 1); j < n; j++) {
				
				if (students[i].compareStudents(students[j])) {
					Student tmp = students[i];
					students[i] = students[j];
					students[j] = tmp;
				}
			}
		}
		return students;
	}

	// Define method to compare students based on marks and names
	// to be used in sortStudents
	private boolean compareStudents(Student otherStudent) {
		// sort students in Descending order of their average marks for three courses
		if (otherStudent.average > this.average) {
			return true;
		}
		else if (otherStudent.average < this.average) {
			return false;
		} 
		// only those students who have the same average marks 
		// have to be sorted in the descending order of their Physics marks
		if (otherStudent.physic > this.physic) {
			return true;
		}
		else if (otherStudent.physic < this.physic) {
			return false;
		}
		// If their Physics marks are also the same
		// sort them in the descending order of their Chemistry marks
		if (otherStudent.chemistry > this.chemistry) {
			return true;
		}
		else if (otherStudent.chemistry < this.chemistry) {
			return false;
		}
		// If their Chemistry marks are the same
		// sort them in the descending order of their Maths marks
		if (otherStudent.math > this.math) {
			return true;
		}
		else if (otherStudent.math < this.math) {
			return false;
		} 
		// If their Math marks are the same
		// sort them in the ascending order of their name
		if (otherStudent.name.compareTo(this.name) < 0) {
			return true;
		} 
		else {
			return false;
		}
	}

}
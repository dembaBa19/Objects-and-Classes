package oop;
import java.util.Scanner; 

public class StudentCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[5];
		String name;
		double grade;
		for(int i=0; i<5; i++) {
			String nomer[] = {"1st","2nd","3rd","4th","5th"};
			System.out.print("Enter " + nomer[i] + " student name :");
			name = sc.nextLine();
			System.out.print("Enter " + nomer[i] + " student grade :");
			grade = sc.nextDouble();
			sc.nextLine();
			students[i] = new Student(name, grade);
		}
		sc.close();
		printGoodStudents(students);
	}
	public static boolean hasGoodGrades(Student student) {
		if(student.grade>5.50) {
			return true;
		} else {
			return false;
		}
	}
	static void printGoodStudents(Student students[]) {
		for (Student st : students) {
			if (hasGoodGrades(st)) {
				System.out.println(st.name + " is eligible for scholarship!");
			}
		}
	}
}
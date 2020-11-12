package oop;
import java.util.Scanner; 

public class StudentCheck12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student12[] students = new Student12[5];
		String name;
		double grade;
		for(int i=0; i<5; i++) {
			String nomer[] = {"1st","2nd","3rd","4th","5th"};
			System.out.print("Enter " + nomer[i] + " student name :");
			name = sc.nextLine();
			System.out.print("Enter " + nomer[i] + " student grade :");
			grade = sc.nextDouble();
			sc.nextLine();
			students[i] = new Student12(name, grade);
		}
		sc.close();
		printGoodStudents(students);
	}
	public static boolean hasGoodGrades(Student12 student) {
		if(student.getGrade()>5.50) {
			return true;
		} else {
			return false;
		}
	}
	static void printGoodStudents(Student12 students[]) {
		for (Student12 st : students) {
			if (hasGoodGrades(st)) {
				System.out.println(st.getName() + " is eligible for scholarship!");
			}
		}
	}
}
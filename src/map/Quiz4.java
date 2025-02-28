package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz4 {

	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1001, new Student(1001, "둘리", 90, 80, 70));
		map.put(1002, new Student(1002, "도우너", 55, 65, 75));
		map.put(1003, new Student(1003, "또티", 80, 50, 50));
		
		Collection<Student> values = map.values();
		
		for (Student student : values) {
			int sum = student.kor + student.math + student.eng;
			double avg = sum / 3.0;
			System.out.println(student.name + "학생의 총점: " + sum + ", 평균: " + avg);
	}
			System.out.println();
			int korSum = 0;
			int mathSum = 0;
			int engSum = 0;

			for (Student student : values) {
				korSum = korSum + student.kor;
				mathSum = mathSum + student.math;
				engSum = engSum + student.eng;
				
				System.out.println("국어의 총점: " + korSum + ", 평균: " + (korSum / 3.0));
				System.out.println("수학의 총점: " + mathSum + ", 평균: " + (mathSum / 3.0));
				System.out.println("영어의 총점: " + engSum + ", 평균: " + (engSum / 3.0));
			}
}
}
	
class Student {
	int studentId;
	String name;
	int kor;
	int math;
	int eng;
	
	public Student(int studentId, String name, int kor, int math, int eng) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", kor=" + kor + ", math=" + math
				+ ", eng=" + eng + "]";
	}
	
	
}
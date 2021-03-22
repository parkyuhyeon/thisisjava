package exercise06;

import java.util.function.ToIntFunction;

public class LambdaExample {

	private static Student[] students = {
		new Student("ȫ�浿", 90, 96),
		new Student("�ſ��", 95, 93)
	};
	
	// avg() �޼ҵ� �ۼ�
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : students) {
			sum += function.applyAsInt(student);
		}
		return (double) sum / students.length;
	}
	
	public static void main(String[] args) {
//		double englishAvg = avg( s -> s.getEnglishScore() );
		double englishAvg = avg( Student :: getEnglishScore);
		System.out.println("���� ��� ����: " + englishAvg);
		
//		double mathAvg = avg(s -> s.getMathScore() );
		double mathAvg = avg(Student::getMathScore);
		System.out.println("���� ��� ����: " + mathAvg);
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() { return name; }
		public int getEnglishScore() { return englishScore; }
		public int getMathScore() { return mathScore; }
	}

}

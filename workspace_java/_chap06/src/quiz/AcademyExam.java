package quiz;

public class AcademyExam {

	public static void main(String[] args) {
		
		Academy a1 = new Academy("천안휴먼센터");
		
		Student s1 = new Student();
		s1.name = "최민수";
		s1.age = 20;

		Student s2 = new Student();
		s2.name = "박춘보";
		s2.age = 30;
		
		a1.join(s1);
		a1.join(s2);
		a1.viewList();
		
		Student ss1 = a1.getStudent(0);
		ss1.study("클래스");
	}

}

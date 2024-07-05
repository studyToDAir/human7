package quiz;

public class StudentExam {

	public static void main(String[] args) {

		Student s1 = new Student();
		// 필드는 초기화 없는 경우 0, null, false로
		// new 하는 순간 자동 초기화 됨
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		s1.name = "최민수";
		s1.age = 20;
		s1.hasGlasses = true;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		// s1.name과 내 지역변수 name은 아무 관계 없음
		String name = "아무거나";
		System.out.println(s1.name);
		
		// 지역 변수는 초기화 없이 사용 불가능
//		int a;
//		System.out.println(a);
		
		
		Student s2 = new Student();
		System.out.println(s2.name);
		
		s2.name = "박춘보";
		s2.age = 50;
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		
		System.out.println(s1.name);
		
		System.out.println(s1);
		int intel = s1.study("java 클래스");
		System.out.println("공부했더니 지식 : "+ intel);
		
		int h = s1.eat("제육");
		System.out.println("s1의 공복감은 : "+ h);
//		s1.eat("마라탕");
//		System.out.println(   s1.eat("마라탕")   );
		
		int s = s1.doGame("젤다의전설");
		System.out.println("현재 스트레스 : "+ s);
		
		s = s1.doGame("메이플스토리", 3);
		System.out.println("현재 스트레스 : "+ s);
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		view(s1);
	}
	
	static void view(Student s) {
		int stress = s.doGame("오버워치");
		System.out.println("이 학생의 스트레스 수치는 : "+ stress);
	}

}

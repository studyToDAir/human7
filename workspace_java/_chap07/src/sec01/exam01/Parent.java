package sec01.exam01;

public class Parent{

	
//	Parent(){
//		super();
//		this("a");	// super()와 this()는 모두 첫줄에 적어야 하므로
					// 같이 사용할 수는 없다
//		System.out.println("Parent 기본 생성자");
//	}
	
	Parent(String name){
		System.out.println("Parent 기본 생성자");
	}
	
	String name = "Parent의 name";
	
	String getName() {
		System.out.println("Parent의 getName 실행");
		return this.name;
	}
	
}

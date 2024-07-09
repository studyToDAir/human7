package sec01.exam01;

public class Parent {

	
//	Parent(){
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

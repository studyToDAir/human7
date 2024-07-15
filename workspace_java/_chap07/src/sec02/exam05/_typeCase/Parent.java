package sec02.exam05._typeCase;

public class Parent {
	public String field1 = "Parent의 field1";
	
	public void method1(String field1) {
		System.out.println("Parent의 method1 실행");
		this.field1 = field1;
		System.out.println("전달인자 field1 : "+ field1);
		System.out.println("필드 field1 : "+ this.field1);
	}
}

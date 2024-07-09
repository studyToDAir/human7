package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {

		Child c1 = new Child();
		c1.printName();
		System.out.println(c1.name);
		String str = c1.getName();
		System.out.println(str);
		
		c1.setName("자식이 보낸 이름");
		System.out.println(c1.name);
		
	}

}

package sec03.exam01;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		try {
			System.out.println(1);
			Integer.parseInt("abc");
			System.out.println(2);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("�̻��ѵ�?");
		}
		System.out.println(3);
		
	}

}

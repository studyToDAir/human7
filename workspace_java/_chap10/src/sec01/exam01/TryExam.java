package sec01.exam01;

//import java.lang.*;

public class TryExam {

	public static void main(String[] args) {
		try {
			String s1 = null;
//			System.out.println(s1.length()); // NullPointerException
			System.out.println(s1);

			int[] a = new int[2];
//		a[100] = 3;	// ArrayIndexOutOfBoundsException

//			String s2 = "20a";
			java.lang.String s2 = "20";
			int age = 0;

			age = Integer.parseInt(s2); // NumberFormatException
			System.out.println(age + 1);

			ThrowsTest tt = new ThrowsTest();
//			tt.throwException();
			
			tt.human(3);

			
		} catch (HumanException he) {
			
			String message = he.getMessage();
			if("EC05".equals(message)) {
				System.out.println("5 미만을 입력하셨군요. 확인해주세요");
			} else if("EC10".equals(message)) {
				System.out.println("10 초과해서 입력하셨군요. 확인해주세요");
			}
			
		} catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e);
			System.out.println("----------------");

			e.printStackTrace();

			System.out.println("----------------");
			System.out.println(e.getMessage());
		}

		System.out.println("완료");

	}

}

package quiz;

import java.util.Scanner;

public class UpDownExam {

	public static void main(String[] args) {

		UpDown ud = new UpDown();
		ud.initNumber();
		ud.hint();
		ud.answer(5);
		// TODO return이 있었다면 더 재미있고 정교하게 놀 수 있었겠다 
		ud.answer(7);
		ud.answer(9);
		ud.answer(3);
		ud.answer(2);
		
//		new Scanner(System.in);
	}

}

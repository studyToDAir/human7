package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {

	public static void main(String[] args) {

		String path = "c:\\temp";
		String fileName = "test.txt";
		OutputStream os = null;
		try {
			// 스트림 열기
			os = new FileOutputStream(path +"\\"+ fileName);
			
			String data = "abc\n한글\n123";
			byte[] datas = data.getBytes();
			
			// 쓰기
			os.write(datas);
			// 남은것 내보내기
			os.flush();
//			// 닫기
//			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		// try-with-resources
		// ()안에 AutoClosable 인터페이스를 구현한 클래스를 선언하면
		// 알아서 close() 실행해줌
		try(
			OutputStream os2 = new FileOutputStream(path +"\\"+ fileName);
		){
			String data = "abc\n한글\n123";
			byte[] datas = data.getBytes();
			
			// 쓰기
			os2.write(datas);
			// 남은것 내보내기
			os2.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

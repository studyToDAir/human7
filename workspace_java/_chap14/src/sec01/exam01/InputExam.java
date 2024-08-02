package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void main(String[] args) {

		String path = "c:\\temp\\test.txt";
		
		try(
			InputStream is = new FileInputStream(path);
		){
			
			// 퍼담을 바가지 설정
//			int BUFFER_SIZE = 1024 * 8;
			int BUFFER_SIZE = 10;
			byte[] datas = new byte[BUFFER_SIZE];
			
			int result = 0;		// 읽은 양
			String data = "";	// 실제 읽은 byte를 누적
			
			// 바가지로 읽은 바이트를 돌려줌
			// 읽을게 없으면 -1
//			result = is.read(datas);
//			while(result != -1) {
//				result = is.read(datas);
//				
//				if(result != -1) {
//					data += new String(datas, 0, result);
//					System.out.println(data);
//				}
//			}
			while( (result = is.read(datas)) != -1 ) {
				data += new String(datas, 0, result);
			}
			System.out.println("---- 최종 결과 ----");
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

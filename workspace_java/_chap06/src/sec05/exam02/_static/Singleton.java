package sec05.exam02._static;

public class Singleton {
	
//	static Singleton s = null;
	static Singleton s = new Singleton();
	
	// 생성을 못하게 막았다
	private Singleton(){
		
	}
	
	static Singleton getInstance(){
//		if(s == null) {
//			s = new Singleton();
//		}
		
		return s;
	}

}

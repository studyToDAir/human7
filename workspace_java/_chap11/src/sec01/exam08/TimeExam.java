package sec01.exam08;

public class TimeExam {

	public static void main(String[] args) {

		// timestamp
		// unix time
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		for(int i=0; i<10000; i++) {
			System.out.println(i);
		}
		
		System.out.println(  System.currentTimeMillis() - now );
	}

}

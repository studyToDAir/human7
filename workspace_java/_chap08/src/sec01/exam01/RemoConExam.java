package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class RemoConExam {

	public static void main(String[] args) {

		RemoteControl tv = new Tv();
		
		Audio audio = new Audio();
		RemoteControl audio2 = (RemoteControl)audio;
		
//		RemoteControl rc = new RemoteControl();
		
		tv.turnOn();
		audio2.setVolume(12);
//		System.out.println( audio2.volume );
		
		List list = new ArrayList();
//		List l2 = new List();
		
	}

}

package quiz;

import java.util.ArrayList;

public class KorJpn extends Dict{

	ArrayList words = new ArrayList();
	
	KorJpn(){
		this.words.add("아이");
		this.words.add("유조우");
		
		super.words = this.words;
	}
	
}

package _chap09;

import java.util.Comparator;

public class OrderBy implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		MemberDTO dto1 = (MemberDTO)o1;
		MemberDTO dto2 = (MemberDTO)o2;
		
		return dto1.getAge() - dto2.getAge();
	}

}

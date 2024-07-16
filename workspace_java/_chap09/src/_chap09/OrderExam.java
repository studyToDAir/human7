package _chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {

		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		
		m1.setName("최민수");
		m1.setAge(20);
		
		m2.setName("최민수");
		m2.setAge(20);
		
//		m1 == m2
		if(m1.equals(m2)) {
			System.out.println("같습니다");
		}
		
		m3.setName("차수");
		m3.setAge(21);
		
//		System.out.println(m1 > m2);
		System.out.println(m1.getAge() > m2.getAge());
		
		
		MemberDTO m4 = compareMemberDTO(m1, m2);
		System.out.println(m4);
		
		
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		System.out.println(list);
		
//		Comparator comp = new OrderBy();
		// 위의 new OrderBy()와 아래의 코드는 완전히 같은 코드이다.
		// 아래 방법을 익명객체라고 한다
		// 이름이 없는 클래스를 new하고
		//		new () {}
		// 뭔가 클래스명을 적어야 할 것 같은 곳에
		// interface를 적음
		// 단, 하나의 인터페이스만 사용할 수 있음
		// 이러면 그 interface를 구현한 익명 클래스가 생성된다
		// let fn = function(){}
		Comparator comp = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				MemberDTO dto1 = (MemberDTO)o1;
				MemberDTO dto2 = (MemberDTO)o2;
				
				return dto1.getAge() - dto2.getAge();
			}
			
		};
		
		Collections.sort(list, comp);
		System.out.println(list);
	}

	/**
	 * 기능 : 둘 중에 나이가 큰 MemberDTO를 돌려줌
	 * 
	 * @param MemberDTO, MemberDTO
	 * @return MemberDTO
	 */
	static MemberDTO compareMemberDTO(MemberDTO dto1, MemberDTO dto2) {
//		if(dto1.getAge() > dto2.getAge()) {
//			return dto1;
//		} else {
//			return dto2;
//		}
		
		if(dto1.getAge() - dto2.getAge() > 0) {
			return dto1;
		} else {
			return dto2;
		}
		
		
	}
	
}

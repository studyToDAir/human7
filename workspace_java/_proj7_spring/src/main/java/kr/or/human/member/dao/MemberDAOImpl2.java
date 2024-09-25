package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("m")
@Primary
public class MemberDAOImpl2 implements MemberDAO {

	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		
		return list;
	}

}

package kr.or.human.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.or.human.member.dao.MemberDAO;

public class MemberServiceImpl implements MemberService{

	// IoC
	// Inversion of Control
	// 제어의 역전
	// 찾아서 new까지 대신 해줌
	
	// DI
	// Dependency Injection
	// 의존성 주입
	// 변수에 넣기
	
	// 우선순위
	// 1. 완전히 동일한 클래스
	// 2. 자동 형변환이 가능한 클래스
	@Autowired
	MemberDAO memberDAO;
	
//	MemberServiceImpl(MemberDAO memberDAO){
//		this.memberDAO = memberDAO;
//	}
	
	public void setMemberDAO(MemberDAO memberDAO){
		this.memberDAO = memberDAO;
	}
	
	@Override
	public List listMember() {
//		MemberDAOImpl dao = new MemberDAOImpl();
//		MemberDAO dao = new MemberDAOImpl();
//		List list = dao.selectMember();

		List list = this.memberDAO.selectMember();
		return list;
	}


}

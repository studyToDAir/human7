package kr.or.human.member.controller;

import kr.or.human.member.dao.MemberDAOImpl;
import kr.or.human.member.service.MemberService;
import kr.or.human.member.service.MemberServiceImpl;

public class MemberController {

	void listMember() {
		MemberService memberService = new MemberServiceImpl();
//		memberService.setMemberDAO(new MemberDAOImpl());
		
		
	}
	
}

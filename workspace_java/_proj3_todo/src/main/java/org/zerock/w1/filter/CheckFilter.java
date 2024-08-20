package org.zerock.w1.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class CheckFilter implements Filter {

	public CheckFilter() {
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 서블릿 실행 전 처리
		System.out.println("doFilter 실행 전");
		long before = System.currentTimeMillis();
		
		// 한글 관련
		request.setCharacterEncoding("utf-8");

		// Filter의 doFilter에서의 전달인자는 우리가 사용했던
		// HttpServletRequest를 부모형태로 캐스팅한 변수를 사용하고 있어서
		// 필요한 메소드 사용을 위해 다시 자식 형태로 형변환
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		System.out.println("getServletPath : " + req.getServletPath());

		// 그냥 세션없어도 통과하는 주소
		// 세션이 있어야 통과하는 주소

		if (isExclude(req.getServletPath())) {
			System.out.println("세션 없이 진행");
			
			if(req.getServletPath().indexOf("/assets/") == -1) {
				response.setContentType("text/html; charset=utf-8;");
			}

			chain.doFilter(request, response);
		} else {
			// 세션을 점검해서
			HttpSession session = req.getSession();
			Boolean isLogon = (Boolean) session.getAttribute("isLogon");
			// 로그인 되어 있는 경우에만 통과
			if (isLogon != null && isLogon == true) {
				System.out.println("로그인 되어 있어서 통과");
				chain.doFilter(request, response);
			} else {
				System.out.println("로그인 안되서 통과 못함");
				// 그렇지 않으면 다른 페이지로 이동
				resp.sendRedirect(req.getContextPath() + "/session");
			}
		}



		// 서블릿 실행 후 처리
		System.out.println("doFilter 실행 후");
		long after = System.currentTimeMillis();
		System.out.println("걸린시간 : "+ (after - before));
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("필터 init 실행");
	}

	private boolean isExclude(String servletPath) {
		if (   "/login".equals(servletPath) 
			|| "/logout".equals(servletPath) 
			|| !"/session/mypage".equals(servletPath)) {
			return true;
		} else {
			return false;
		}
	}
}

package org.zerock.w1.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CheckFilter implements Filter {

    public CheckFilter() {
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 서블릿 실행 전 처리
		System.out.println("doFilter 실행 전");
		
		// 한글 관련
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		
		
		// 서블릿 실행(doGet같은거)
		chain.doFilter(request, response);
		
		// 서블릿 실행 후 처리
		System.out.println("doFilter 실행 후");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("필터 init 실행");
	}

}

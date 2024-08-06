package org.zerock.w1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet의 전달인자 글씨로 주소가 연결됨
// 원래는 전달인자로 urlPatterns={"주소1", "주소2"} 이케이케 적을 수 있고
// 책처럼28p. name등 다른 요소도 넣을 수 있지만
// 주소하나만 쓰는 경우 모두 생략할 수 있다.
@WebServlet("/my")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("MyServlet 생성자 실행");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
    	System.out.println("init() 실행");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    // get방식으로 요청한 경우 doGet 메소드를 톰켓이 실행해 준다.
    // 우리는 doGet을 override해서 원하는 알고리즘을 수행할 수 있다.
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doGet 실행");
    	// HttpServletRequest : 요청에 관련된 모든 내용이 들어있다
    	// HttpServletResponse : 응답에 관련된 모든 내용을 넣어주면 브라우저까지 전달된다.
//		response.getWriter().append("Served at: ").append(request.getContextPath());
    	PrintWriter out = response.getWriter();
    	out.println("<h1>");
    	out.print("Hello Servlet");
    	out.println("</h1>");
    	out.println("<hr>");
    	
    	for(int i=0; i<10; i++) {
    		out.println(i + "<br>");	
    	}
    	
	}

}

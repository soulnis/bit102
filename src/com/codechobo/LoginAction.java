package com.codechobo;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




	@WebServlet("/LoginAction")
	public class LoginAction extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	  
	
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */

		
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
	    	request.setCharacterEncoding("utf-8");
	    	response.setContentType("text/html ; charset=UTF-8");  //아래 로직은 html파일이다.라는걸 설정 MIME설정 text/HTLl
		//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
			   
		    String id =request.getParameter("Id");
		    String pwd =request.getParameter("pwd");
		   
		    if(id.equals("asdf")&&pwd.equals("1234")) {
		    	//아이디와 암호가 일치하는경우
		    	response.sendRedirect("/");
		    	
		    } else {
		    	//id와pwd가 일치하지 않는 경우
		    	request.setAttribute("msg", "id 또는 비밀번호가 틀립니다.");// request객체 메세지를 저장
		    
		       RequestDispatcher reqDis= request.getRequestDispatcher("/loginForm.jsp");
		       reqDis.forward(request, response);
		    }
		    
		    
//		    PrintWriter out=response.getWriter();
//            out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("</head>");
//			out.println("<body>");
//			
//			out.println("<h1>Hello, "+id+".</h1>");
//			out.println("<h1>Your password is "+pwd+".</h1>");
//			
//			out.println("</body>");
//			out.println("</html>");
//		
		
		
		
	    }
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	// TODO Auto-generated method stub
	    	doGet(req, resp); // post로 받은 값을 get값을 호출해서 값을 반환해줌
	    }
	}     
	
		  
		
		

		
		
		
	
	

	

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
	    	response.setContentType("text/html ; charset=UTF-8");  //�Ʒ� ������ html�����̴�.��°� ���� MIME���� text/HTLl
		//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
			   
		    String id =request.getParameter("Id");
		    String pwd =request.getParameter("pwd");
		   
		    if(id.equals("asdf")&&pwd.equals("1234")) {
		    	//���̵�� ��ȣ�� ��ġ�ϴ°��
		    	response.sendRedirect("/");
		    	
		    } else {
		    	//id��pwd�� ��ġ���� �ʴ� ���
		    	request.setAttribute("msg", "id �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");// request��ü �޼����� ����
		    
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
	    	doGet(req, resp); // post�� ���� ���� get���� ȣ���ؼ� ���� ��ȯ����
	    }
	}     
	
		  
		
		

		
		
		
	
	

	

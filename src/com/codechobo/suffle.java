package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="/suffle",urlPatterns= {"/card.*"})
public class suffle extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
	
		PrintWriter out=resp.getWriter();


          
		
		// String �迭��  ������ �迭�� �°� img �±׸� �־���.
	    String[] img={"<img src='img/dice1.jpg'>","<img src='img/dice2.jpg'>",
	    		"<img src='img/dice3.jpg'>","<img src='img/dice4.jpg'>",
	    		"<img src='img/dice5.jpg'>","<img src='img/dice6.jpg'>"};
	    Random random= new Random(); //Random Ŭ������ ���� ���� ���� �����Ҷ� ���
	    int a=(int)random.nextInt(6);//==(int)((Math.random()*6));
	    int b=(int)random.nextInt(6);//==(int)((Math.random()*6));
	    // random.nextInt(6 ������ 0~6���� �����ǰ��� ����);
	     
	    out.print(img[a]); // ���Ǽ��� �´� ������� img[5]��� 5��° ���� ����
	    out.print(img[b]);

	 
	
	
	
	}   
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(req,resp);
		}
	
}

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


          
		
		// String 배열로  각각에 배열에 맞게 img 태그를 넣어줌.
	    String[] img={"<img src='img/dice1.jpg'>","<img src='img/dice2.jpg'>",
	    		"<img src='img/dice3.jpg'>","<img src='img/dice4.jpg'>",
	    		"<img src='img/dice5.jpg'>","<img src='img/dice6.jpg'>"};
	    Random random= new Random(); //Random 클래스가 존재 랜덤 값을 지정할때 사용
	    int a=(int)random.nextInt(6);//==(int)((Math.random()*6));
	    int b=(int)random.nextInt(6);//==(int)((Math.random()*6));
	    // random.nextInt(6 넣으면 0~6까지 임의의값이 나옴);
	     
	    out.print(img[a]); // 임의수에 맞는 것을출력 img[5]라면 5번째 값이 나옴
	    out.print(img[b]);

	 
	
	
	
	}   
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(req,resp);
		}
	
}

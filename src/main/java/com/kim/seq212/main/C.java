package com.kim.seq212.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Controller : Servlet
//			상황판단해서 M/V 소환
//			어떤 요청이 들어왔을때
//			이 사이트의 진입점 실행은 여기서

// Back-end 웹 개발자 A = PL급





@WebServlet("/C")
public class C extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("V1.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	M.add(request); //계산을 먼저 하고 결과를 바야!
	request.getRequestDispatcher("V2.jsp").forward(request, response);
	
	}

}

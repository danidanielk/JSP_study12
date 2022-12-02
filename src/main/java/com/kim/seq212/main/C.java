package com.kim.seq212.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Controller : Servlet
//			��Ȳ�Ǵ��ؼ� M/V ��ȯ
//			� ��û�� ��������
//			�� ����Ʈ�� ������ ������ ���⼭

// Back-end �� ������ A = PL��





@WebServlet("/C")
public class C extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("V1.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	M.add(request); //����� ���� �ϰ� ����� �پ�!
	request.getRequestDispatcher("V2.jsp").forward(request, response);
	
	}

}

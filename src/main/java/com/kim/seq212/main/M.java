package com.kim.seq212.main;

import javax.servlet.http.HttpServletRequest;

//Model : �Ϲ� jaca class
//		���� ����(���,dB ,...)
//		back-end ������ b
public class M {
	
	public  static void add(HttpServletRequest request) {//��û��ü 
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x+y;
		request.setAttribute("z", z);
		
		
	}

}

package mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes= {
			"Client: \"Can you make the website faster?\"\r\n"
			+ "Developer: Sure, let me just remove all the features you asked for.",
			"Why do programmers prefer dark mode?\r\n"
			+ "Because the light attracts bugs!",
			"Why did the developer break up with their girlfriend?\r\n"
			+ "They had too many arguments.",
			"I told my computer I needed a break, and now it won’t stop sending me\r\n"
			+ "“404: Break not found” errors!"
	};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		//type casting
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		//int sum = num1 + num2;
		
		int ans ;
		if(str3.equals("1")) ans=a+b;
		else if(str3.equals("2")) ans=a-b;
		else if(str3.equals("3")) ans=a*b;
		else  ans=a/b;
//		//response.getWriter().append("Ans = "+ans);
		
		int randomIndex= (int) (Math.random() * jokes.length);
		String randomJoke = jokes[randomIndex];
		response.sendRedirect("NewFile.jsp?ans="+ans+"&joke="+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

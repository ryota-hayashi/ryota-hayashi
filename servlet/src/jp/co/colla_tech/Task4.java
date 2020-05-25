package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task4")
public class Task4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		String [] array = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		int r = new Random().nextInt(array.length);

		//headerメソッドの呼び出し
		HtmlTemplate.header(out);

		//占い結果表示
		out.println("<p>↓占い結果↓</p>");
		out.println("<h1>" + array[r] + "</h1>");

		//footerメソッドの呼び出し
		HtmlTemplate.footer(out);
	}

}
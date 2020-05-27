

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//リクエストパラメータの文字コードを指定
		request.setCharacterEncoding("UTF-8");

		//名前
		String name = request.getParameter("name");
		//性別
		String sex = request.getParameter("sex");
		//お問い合わせ種類
		String select = request.getParameter("select");
		//お問い合わせ内容
		String textArea = request.getParameter("textArea");

		//表示
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<p>以下の内容でお問い合わせしました。回答をお待ちください。</p><br>");
		out.println("<p>名前:" + name + "様</p>");
		out.println("<p>性別:" + sex + "</p>");
		out.println("<p>お問い合わせ種類:" + select + "</p>");
		out.println("<p>お問い合わせ内容:" + textArea + "</p>");
	}

}

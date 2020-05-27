import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>クッキーテスト</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>訪問回数テスト（クッキー）</h1>");

		//Cookieの値を取得
		Cookie[] cookie = request.getCookies();

		//訪問回数用のCookieを作成
		Cookie cookieTimes = null;

		//nullCheck
		if (cookie != null) {

			//全てのCookieをみて、名前がCountの値を取得
			for (int i = 0; i < cookie.length; i++) {

				if (cookie[i].getName().equals("Count")) {
					cookieTimes = cookie[i];
				}

			}

		}

		if (cookieTimes != null) {

			int times = Integer.parseInt(cookieTimes.getValue()) + 1;

			out.println("<p>" + times + "回目の訪問です</p>");

			//数値から文字列変換して設定
			cookieTimes.setValue(Integer.toString(times));

			//有効期限設定
			cookieTimes.setMaxAge(300);

			//Cookieの保存
			response.addCookie(cookieTimes);

		}

		else {
			out.println("<p>初回の訪問です</p>");

			//Cookieの作成
			Cookie newcookie = new Cookie("Count", "1");

			//有効期限を5分に設定
			newcookie.setMaxAge(300);

			//Cookieを保存
			response.addCookie(newcookie);
		}

		out.println("<a href=\"CountCookie\">画面を再訪問</a>");

	    out.println("</body>");
	    out.println("</html>");

	}

}

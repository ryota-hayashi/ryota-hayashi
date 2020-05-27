import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/countSession")
public class countSession extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();


			out.println("<h1>訪問回数テスト（セッション）</h1>");

			//セッションを取得
			HttpSession session = request.getSession(false);

		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>セッションテスト</title>");
		    out.println("</head>");
		    out.println("<body>");

			if(session == null) {

				out.println("<p>初回の訪問です</p>");

				session = request.getSession(true);
				session.setAttribute("visited", "1");

			}else {

				String visitedStr = (String)session.getAttribute("visited");
				int visited = Integer.parseInt(visitedStr);
				visited++;

				out.println("<p>訪問回数は" + visited + "回目です</p>");

				session.setAttribute("visited", Integer.toString(visited));
			}

			out.println("<a href=\"countSession\">画面を再訪問</a>");

		    out.println("</body>");
		    out.println("</html>");

	}

}
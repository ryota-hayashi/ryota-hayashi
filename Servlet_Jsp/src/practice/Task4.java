package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/task4")
public class Task4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset = UTF-8");

		Date today = new Date();

		String [] fortune = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		int i = new Random().nextInt(fortune.length);

		FortuneBean fortuneBean = new FortuneBean();
		fortuneBean.setToday(today);
		fortuneBean.setFortune(fortune[i]);
		request.setAttribute("FORTUNE", fortuneBean);

		request.getRequestDispatcher("/WEB-INF/jsp/fortune_result.jsp").forward(request, response);
	}

}
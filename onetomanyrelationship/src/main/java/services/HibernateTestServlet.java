package services;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Answer;
import beans.Question;

/**
 * Servlet implementation class HibernateTestServlet
 */
public class HibernateTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	void register(Question question1) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(question1);

		session.getTransaction().commit();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HibernateTestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Answer> ansList = new ArrayList<Answer>();

		Question question1 = new Question();
		question1.setQues("What is Hibernate?");
		question1.setAnswers(ansList);

		Answer ans1 = new Answer();
		ans1.setAnswers("Hibernate is a framework");
		ans1.setPostedBy("Anita");
		ansList.add(ans1);

		Answer ans2 = new Answer();
		ans2.setAnswers("Hibernate is based on ORM");
		ans2.setPostedBy("Sunil");
		ansList.add(ans2);

		register(question1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

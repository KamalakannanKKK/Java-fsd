package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import beans.Address;
import beans.EmployeeDetails;

/**
 * Servlet implementation class HibernateTestServlet
 */
public class HibernateTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int register(EmployeeDetails user){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		 int i=(Integer)session.save(user);
		session.getTransaction().commit();

		session.close();
		return i;
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HibernateTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDetails e1=new EmployeeDetails();    
	    e1.setName("Kartik");    
	    e1.setEmail("Kartik@gmail.com");    
	        
	    Address address1=new Address();    
	    address1.setAddressLine1("F-9, ABC nagar");    
	    address1.setCity("Ghaziabad");    
	    address1.setState("UP");    
	    address1.setCountry("India");    
	    address1.setPincode(201301);    
	        
	    e1.setAddress(address1);    
	    address1.setEmployee(e1);   
	    
		int i=register(e1);
		PrintWriter out=response.getWriter();
				if(i>0)
					out.println("Record Inserted");
				else
					out.println("Record not Inserted");
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeekFourServlet
 */
@WebServlet("/WeekFourServlet")
public class WeekFourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeekFourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Name=request.getParameter("Name");
		String Email=request.getParameter("Email");
		String Education=request.getParameter("Education");
		String Degree=request.getParameter("Degree");
		String Major=request.getParameter("Major");
		String University=request.getParameter("University");
		String GraduationDateMonth=request.getParameter("GraduationDateMonth");
		String GraduationDateYear=request.getParameter("GraduationDateYear");
		String Position=request.getParameter("Position");
		String Company=request.getParameter("Company");
		String StartMonth=request.getParameter("StartMonth");
		String StartYear=request.getParameter("StartYear");
		String Duty1=request.getParameter("Duty1");
		String Duty2=request.getParameter("Duty2");
		String Skill=request.getParameter("Skill");
		String Proficiency=request.getParameter("Proficiency");
		
		//System.out.print("The CUstomer ID is:  ");
		//System.out.print(CustID);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

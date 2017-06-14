

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		//System.out.print("The CUstomer ID is:  ");
		//System.out.print(CustID);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//Scanner s= new Scanner(System.in);
	    String[] eduAchievementArray = new String[10];
	    String[] workExperienceArray = new String[10];
	    String[] skillsArray = new String[20];
	    String eduAll=null;
	    String workAll=null;
	    String skillAll=null;
	    String name, email, typeOfDegree, major, university, education,  position, nameOfEmployer, monthStart, dateLeft, monthLeft,duty1, duty2, experience, skillName, proficiency, skill, yesOrNo;
	    int yearOfGrad,yearStart, yearLeft;
	   	String nextURL="/WeekFourJSP.jsp";
		HttpSession session =  request.getSession();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt=null;
		
		
			name=request.getParameter("Name");
	        
	        
	        do{
	        	email=request.getParameter("Email");
	        if (email.indexOf('@')==-1 || email.indexOf('.')==-1){
	        	System.out.print("please enter valid email: ");
	        email=null;
	        }
	        }while(email==null);
	        System.out.println(" EDUCATION\n You can add a maximum of 10 degrees");
	        
	        
	        int i=0;
	        do{
				
				
				typeOfDegree=request.getParameter("Degree");
				
				major=request.getParameter("Major");
				
				university=request.getParameter("University");
				
				/*
				while(!s.hasNextInt()){
					System.out.println(" Enter the year you received the degree (eg: 2002)");
	                s.next();
	                }
	                */
				yearOfGrad = Integer.parseInt(request.getParameter("GraduationDateYear"));
				
				education = String.format("%s in %s, \n%s, %d \n", typeOfDegree, major, university, yearOfGrad);
				eduAchievementArray[i]=education;
				eduAll+=education;
				i++;
				
					do{
						//System.out.println(" Do you want to add another education? (Y/N)");
						yesOrNo=request.getParameter("yesOrNoEdu");
					}while(yesOrNo!="Y"&&yesOrNo!="y"&&yesOrNo!="N"&&yesOrNo!="n");
			}while(yesOrNo=="Y"||yesOrNo=="y"&&i<10);
		    
	        System.out.println(" Work experience.\n Start with your most recent job. \n You can add a maximum of 10 experiences ");
	        int a=0;
	        do{
	        	
	        	
	        	position=request.getParameter("Position");
	            
	            nameOfEmployer=request.getParameter("Company");
	           /* 
	            while(s.hasNextInt()){
	            	System.out.println(" Enter the month in letters, not numbers. Enter the month you began working (eg: May)");
	                s.next();
	            }*/
	            monthStart=request.getParameter("StartMonth");
	            
	            /*
	            while(!s.hasNextInt()){
	            	System.out.println(" That was not an integer. Enter the year you began working at that job(eg: 2008)");
	            s.next();
	            }*/
	            yearStart=Integer.parseInt(request.getParameter("StartYear"));
	            do{
	            	//System.out.println(" Is this your current job? (Y/N)");
	    			yesOrNo=request.getParameter("yesOrNoCurrent");
	    			}while(yesOrNo!="Y"&&yesOrNo!="y"&&yesOrNo!="N"&&yesOrNo!="n");
	            if (yesOrNo=="Y"||yesOrNo=="y"){
	            	dateLeft="Present";
	            }else{
	            	
	            	/*while(s.hasNextInt()){
	            		System.out.println(" Enter the month in letters, not numbers. Enter the month you left that job (eg: May");
	                    s.next();
	                }*/
	                monthLeft= request.getParameter("EndMonth");
	                System.out.println(" Enter the year you left that job");
	                /*while(!s.hasNextInt()){
	                	System.out.println(" That was not an integer. Enter the year you left that job");
	                    s.next();
	                    }*/
	                yearLeft=Integer.parseInt(request.getParameter("EndYear"));
	                dateLeft = monthLeft+""+ Integer.toString(yearLeft);
	            }
	                       
	            System.out.println(" DUTIES\n Enter your first duty: ");
	            duty1=request.getParameter("Duty1");
	            System.out.println(" Enter your second duty: ");
	            duty2=request.getParameter("Duty2");
	                    
	            experience = String.format("%s \n %s, %s %d - %s \n -Duty 1: %s \n -Duty 2: %s \n ", position, nameOfEmployer, monthStart, yearStart, dateLeft, duty1, duty2);
	            workExperienceArray[a]=experience;
	            workAll+=experience;
	            a++;
	            
	            
	            do{
	    			//System.out.println(" Do you want to add another work experience? (Y/N)");
	    			yesOrNo=request.getParameter("yesOrNoExp");
	    			}while(yesOrNo!="Y"&&yesOrNo!="y"&&yesOrNo!="N"&&yesOrNo!="n");
	    	}while(yesOrNo=="Y"||yesOrNo=="y"&& a<10);
			
	        int b=0;
	        System.out.println(" SKILLS\n You can add a maximum of 20 skills. ");
			do{
				System.out.println("Add your skill: ");
				skillName=request.getParameter("Skill");
				System.out.println("How proficient are you in this skill?(skilled/proficient/familiar)");
				proficiency=request.getParameter("Proficiency");
				skill= String.format("%s, %s \n", skillName, proficiency);
				skillsArray[b]=skill;
				skillAll+=skill;
				b++;
					do{
	    			//System.out.println(" Do you want to add another skill? (Y/N)");
	    			yesOrNo=request.getParameter("yesOrNoSkill");
	    			}while(yesOrNo!="Y"&&yesOrNo!="y"&&yesOrNo!="N"&&yesOrNo!="n");
		}while(yesOrNo=="Y"||yesOrNo=="y"&& b<20);
		
		 	session.setAttribute("session_Name",name);
		 	session.setAttribute("session_Email",email);
		 	
			System.out.println(name);
			System.out.println(email+ "\n");
			System.out.println("EDUCATION\n");
			
			for(String edu : eduAchievementArray){
				if (edu ==null){
					
				}else{
					session.setAttribute("session_Education",edu);
				}
			}
			
			for(String exp : workExperienceArray){
				if (exp ==null){
					
				}else{
					session.setAttribute("session_Experience",exp);
				}
			}
			
			System.out.println("SKILLS\n");
			for(String ski : skillsArray){
				
				if (ski ==null){
					
				}else{
					session.setAttribute("session_Skill",ski);
				}
			}
		 	
				
		String sql = "Insert into RoboResume (UsernName, email, education, experience, skills)values(?,?,?,?,?)";  
		 
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Customers?"+ "user=root&password=password");
            pstmt = con.prepareStatement(sql);
            //
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, eduAll);
            pstmt.setString(4, workAll);
            pstmt.setString(5, skillAll);
            
            rs = pstmt.executeQuery();
            
          
            
		}catch (SQLException e){
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				getServletContext().getRequestDispatcher(nextURL).forward(request, response);
				rs.close();
				pstmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	
	}
	
}
	

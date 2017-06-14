<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action ="WeekFourServlet" method="post">
Enter your Name: <input type="text" name ="Name"></input><br/>

Enter your Email: <input type="text" name ="Email"></input><br/>
<p>Education</p><br/>
Enter your Degree : <input type="text" name ="Degree"></input><br/>
Enter your major: <input type="text" name ="Major"></input><br/>
Enter the University: <input type="text" name ="University"></input><br/>

Enter the graduation year: <input type="text" name ="GraduationDateYear"></input><br/>

<%
String YorN = null;
out.println("Do you want to add another degree? (Y/N)" +"<input type = \"text\" name = "+YorN+"></input>");


%>


<p>Experience</p><br/>
Enter the position: <input type="text" name ="Position"></input><br/>
Enter the name of Organization: <input type="text" name ="Company"></input><br/>
Enter the Start month: <input type="text" name ="StartMonth"></input><br/>
Enter the Start year: <input type="text" name ="StartYear"></input><br/>
Is this your current job? (Y/N):  <input type="text" name ="yesOrNoCurrent"></input><br/>
Enter the End month: <input type="text" name ="EndMonth"></input><br/>
Enter the End year: <input type="text" name ="EndYear"></input><br/>
Duties<br/>
Enter Duty 1: <input type="text" name ="Duty1"></input><br/>
Enter Duty 2: <input type="text" name ="Duty2"></input><br/>
Do you want to add another experience? (Y/N)" <input type = "text" name = "yesOrNoExp"></input><br/>
<p>Skills</p><br/>
Enter Skill: <input type="text" name ="Skill"></input><br/>
Enter Proficiency: <input type="text" name ="Proficiency"></input><br/>
Do you want to add another skill? (Y/N)" <input type = "text" name = "yesOrNoSkill"></input><br/>




<input type ="submit" value="Search" ></input><br/>
</form>
</body>
</html>





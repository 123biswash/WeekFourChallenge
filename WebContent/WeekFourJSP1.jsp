<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action ="WeekFourServlet" method="post"></form>
Enter your Name: <input type="text" name ="Name"></input>
Enter your Email: <input type="text" name ="Email"></input>
<p>Education</p>
Enter your Degree : <input type="text" name ="Degree"></input>
Enter your major: <input type="text" name ="Major"></input>
Enter the University: <input type="text" name ="University"></input>

Enter the graduation year: <input type="text" name ="GraduationDateYear"></input>
Do you want to add another degree? (Y/N)" <input type = "text" name = "yesOrNoEdu"></input>
<p>Experience</p>
Enter the position: <input type="text" name ="Position"></input>
Enter the name of Organization: <input type="text" name ="Company"></input>
Enter the Start month: <input type="text" name ="StartMonth"></input>
Enter the Start year: <input type="text" name ="StartYear"></input>
Is this your current job? (Y/N):  <input type="text" name ="yesOrNoCurrent"></input>
Enter the End month: <input type="text" name ="EndMonth"></input>
Enter the End year: <input type="text" name ="EndYear"></input>
Duties
Enter Duty 1: <input type="text" name ="Duty1"></input>
Enter Duty 2: <input type="text" name ="Duty2"></input>
Do you want to add another experience? (Y/N)" <input type = "text" name = "yesOrNoExp"></input>
<p>Skills</p>
Enter Skill: <input type="text" name ="Skill"></input>
Enter Proficiency: <input type="text" name ="Proficiency"></input>
Do you want to add another skill? (Y/N)" <input type = "text" name = "yesOrNoSkill"></input>
<input type ="submit" value="Search" ></input>
</body>
</html>




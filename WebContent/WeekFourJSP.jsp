<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Name: ${session_Name}<br>
Email : ${session_Email}<br>
<p>Education</p>
${session_Degree}, ${session_Major}<br>
${session_University}, ${session_GraduationDate}
<br><br>
<p>Experience</p>
${session_Position}, ${session_Company}<br>
${session_StartMonth} ${session_StartYear} - ${session_EndMonth}${session_EndYear}<br>
Duties
- ${session_Duty1}<br>
- ${session_Duty 2}<br><br>
<p>Skills</p>
${session_Skill}<br>
${session_Proficiency}<br><br>



</body>
</html>



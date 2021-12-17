<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>

<html>
<head>
<title>Student Confirmation </title>
</head>

<body>


The student is confirmed : ${student.firstName} ${student.lastName}


<br><br>

Country : ${student.country}

<br><br>

Favourite Language:${student.favouriteLanguage } <%--spring will call student.getFavouriteLanguage , we are simply just displaying the data here --%>

<br><br>

Operating Systems:

<ul>

<c:forEach var="temp" items="${student.operatingSystems}">

<li>${temp}</li>

</c:forEach>
</ul>








</body>
</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>

<html>
<head>
<title>Student registration form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">
First Name :<form:input path="firstName"/>
<br><br>
last Name :<form:input path="lastName"/>
<br><br>

<br><br>
country:
<form:select path="country" >   <%--on submit spring will call setCountry setter --%>
 <form:options items="${student.countryOptions}"/>           <%--spring will call student.getcountry options --%>   <%--form:option value="Brazil" label="Brazil" --%>
                                                         <%-- form:option value="India" label="India" --%>
                                                      <%--form:option value="Germany" label="Germany" --%>
                                                    <%--form:option value="France" label="France" --%>
</form:select>

<br><br>

Favourite Language:
                                      <%--on submit spring will call student.setFavouriteLanguage() --%>
Java <form:radiobutton path="favouriteLanguage" value="Java" />
C# <form:radiobutton path="favouriteLanguage" value="C#" />
PHP <form:radiobutton path="favouriteLanguage" value="PHP" />
Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" />

<br><br>


Operating Systems :

Linux <form:checkbox path="operatingSystems" value="Linux" />
Mac OS <form:checkbox path="operatingSystems" value="MacOS" />
MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />

<br><br>

<input type="submit" value="Submit"  />

</form:form>


</body>


</html>
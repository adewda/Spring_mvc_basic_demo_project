<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Customer registration form</title>

<style>    
.error {color:red}
</style>


</head>

<body>

<i>Fill out the form. Asterisk (*) means required .</i>
<form:form action="processForm" modelAttribute="customer">

First name : <form:input path="firstname" />
<br><br>
Last name (*): <form:input path="lastname" />
<form:errors path="lastname" cssClass="error" />  <%--display error message if set--%>

<br><br>

Free Passes : <form:input path="freePasses" />
<form:errors path="freePasses" cssClass="error" />
 
<br><br>


Postal Code : <form:input path="postalCode" />
<form:errors path="postalCode" cssClass="error" />
 
<br><br>


Course Code : <form:input path="courseCode" />
<form:errors path="courseCode" cssClass="error" />
 
<br><br>


<input type="submit" value="Submit" />

</form:form>
</body>

</html>
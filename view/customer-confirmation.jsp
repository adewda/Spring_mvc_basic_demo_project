<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>

<html>
<head>

<title>Customer Confirmation </title>

</head>

<body>


The Customer is confirmed : ${customer.firstname} ${customer.lastname}

<br><br>

Free Passes :${customer.freePasses}

<br><br>

Postal Code :${customer.postalCode}

<br><br>

Course Code :${customer.courseCode}


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Register Page</title>
    <link rel="stylesheet" href="CSS/Profile.css" />
</head>
<body>
    <header>
        <div class="header-content">
            <h2>Welcome to the Examination Profile</h2><br></br>
        </div>
    </header>

    <div class="left" style="padding-top: 25px; "> <!-- Add padding to prevent content from hiding behind the fixed header -->
      
      <div class="container">
        <div class="left-half">
          <div class="logo-icon">
            <img src="CSS/2.png" alt="Logo Icon" />
          </div>
          <div class="message">
            <p>Welcome to Online Examination Center</p>
          </div>
        </div>
        <div class="right-half">
          <div class="profile-icon">
            <img src="CSS/user.png" alt="Profile Icon" />
          </div>
	
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="id" value="${ cus.id}" />
	<c:set var="username" value="${ cus.username}" />
	<c:set var="email" value="${ cus.email}" />
	<c:set var="password" value="${ cus.password}" />
	
	<h2>
	
	 ${cus.username}<br>
	 ${cus.email}
	
	</h2>
	

	</c:forEach>
	
	<c:url value="Update.jsp" var="cusupdate">
	<c:param name="id" value="${id}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="password" value="${password}"/>
	 </c:url>
	 
	 <c:url value="Delete.jsp" var="cusdelete">
	<c:param name="id" value="${id}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="password" value="${password}"/>
	 </c:url>
	 
	 
	          <a href="${cusupdate }"><button name="update" >Update Profile</button></a>
               <a href="${cusdelete }"><button name="delete">Delete</button></a>
         <a href="http://localhost:8090/Main/Home.jsp"><button>User Dashboard</button></a> 
        </div>
      </div>
    </div>
 
    <br><br>
        <footer class="footer">
        <div class="footer-content">
            <p>&copy; 2023 Online Examination. All rights reserved.</p>
            <ul class="footer-links">
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms of Service</a></li>
            </ul>
        </div>
    </footer>
    
  </body>
</html>


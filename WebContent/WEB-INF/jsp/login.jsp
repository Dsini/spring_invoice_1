
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
            <link href="bootstrap.min.css" rel="stylesheet">
        </head>
        <body>
        <jsp:include page="logo.jsp" />
        <div class="container">
        <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <form:form id="loginForm" modelAttribute="login"  action="loginProcess.htm" method="post">
                <div class="form-group">

                            <label for="exampleInputEmail1"  >Username: </label>
                        
                            <form:input path="username" class="form-control" aria-describedby="emailHelp" placeholder="Enter email" name="username" id="username" />
                    </div>
                    <div class="form-group">
                            <label for="exampleInputPassword1">Password:</label>
                        </td>
                        <td>
                            <form:password path="password" class="form-control"  placeholder="Password" name="password" id="password" />
                      </div>
                    
                       
                            <button id="login" class="btn btn-primary" name="login">Login</button>
                    <a id="cancel" class="btn btn-primary" name="cancel" href="index.jsp">cancel</a>
                    
                
            </form:form>
            </div>
            <div class="col-md-4"></div>
            </div></div>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
        </body>
        </html>
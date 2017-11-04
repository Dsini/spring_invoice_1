
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
            <link href="bootstrap.min.css" rel="stylesheet">
            <script src = "http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script> 
        </head>
        <body ng-app = "mainApp" ng-controller = "studentController">
        <jsp:include page="logo.jsp" />
        <div class="container">
        <div class="row">
        <div class="col-md-4"></div>
            <div class="col-md-4">
            
                
                    <p style="font-style: italic; color: red;">${message}</p>
  </div>             
        <div class="col-md-4"></div>  
        </div>
           
        <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <form:form id="loginForm" name = "loginForm" modelAttribute="login"  action="loginProcess.htm" method="post">
                <div class="form-group">

                            <label for="exampleInputEmail1"  >Username: </label>
                        
                            <form:input path="username" class="form-control" aria-describedby="emailHelp" placeholder="Enter email"  id="username" ng-model="username" required="required" />
                    <span style = "color:red" ng-show = "loginForm.username.$dirty && loginForm.username.$invalid">
                        <span ng-show = "loginForm.username.$error.required">User Name is required.</span>
                     </span>
                    </div>
                    <div class="form-group">
                            <label for="exampleInputPassword1">Password:</label>
                       
                            <form:password path="password" class="form-control"  placeholder="Password" name="password" id="password" ng-model="password" required="required" />
                       <span style = "color:red" ng-show = "loginForm.username.$dirty && loginForm.username.$invalid">
                        <span ng-show = "loginForm.username.$error.required">Password is required.</span>
                     </span>
                      </div>
                    
                       
                            <button id="login" class="btn btn-primary" name="login" ng-disabled = "loginForm.username.$dirty && 
                            loginForm.username.$invalid || loginForm.password.$dirty && loginForm.password.$dirty" ng-click="submit()">Login</button>
                    <a id="cancel" class="btn btn-primary" name="cancel" href="index.jsp">cancel</a>
                    
                
            </form:form>
            </div>
           </div></div> 
        </body>
        </html>
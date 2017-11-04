
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Sign Up</title>
            <link href="bootstrap.min.css" rel="stylesheet">
            <script src = "http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script> 
        </head>
        <body  ng-app = "mainApp" ng-controller = "studentController">
        <jsp:include page="logo.jsp" />
        <div class="container">
        <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <form:form name = "registrForm"  modelAttribute="user"   action="registerProcess.htm" method="post">
                <div class="form-group">

                            <label for="exampleInputEmail1"  >First Name: </label>
                        
                            <form:input path="firstname" class="form-control"  placeholder="Enter First Name" ng-model="firstname" required="required" />
                    <span style = "color:red" ng-show = "registrForm.firstname.$dirty && registrForm.firstname.$invalid && registrForm.firstname.$touched">
                        <span ng-show = "registrForm.firstname.$error.required">First Name is required.</span>
                     </span>
                    </div>
                    
                    <div class="form-group">

                            <label for="exampleInputEmail1"  >Last Name: </label>
                        
                            <form:input path="lastname" class="form-control"  placeholder="Enter Last Name" ng-model="lastname" required="required" />
                    <span style = "color:red" ng-show = "registrForm.lastname.$dirty && registrForm.lastname.$invalid && registrForm.lastname.$touched">
                        <span ng-show = "registrForm.lastname.$error.required">Last Name is required.</span>
                     </span>
                    </div>
                    <div class="form-group">

                            <label for="exampleInputEmail1"  >Email: </label>
                        
                            <form:input type="email" path="email" class="form-control"  placeholder="Enter Email" ng-model="email" required="required" />
                   <span style = "color:red" ng-show = "registrForm.email.$dirty && registrForm.email.$invalid && registrForm.email.$touched">
                        <span ng-show = "registrForm.email.$error.required">Email is required.</span>
                        <span ng-show = "registrForm.email.$error.email">Invalid email address.</span>
                     </span>
                    </div>
                    <div class="form-group">

                            <label for="exampleInputEmail1"  >Phone Number: </label>
                        
                            <form:input path="phone" class="form-control"  placeholder="Enter Phone Number" ng-model="phone" required="required" />
                    <span style = "color:red" ng-show = "registrForm.phone.$dirty && registrForm.phone.$invalid && registrForm.phone.$touched">
                        <span ng-show = "registrForm.phone.$error.required">Phone Number is required.</span>
                     </span>
                    </div>
                <div class="form-group">

                            <label for="exampleInputEmail1"  >Username: </label>
                        
                            <form:input path="username" class="form-control"  placeholder="Enter Username" ng-model="username" required="required" />
                  <span style = "color:red" ng-show = "registrForm.username.$dirty && registrForm.username.$invalid && registrForm.username.$touched">
                        <span ng-show = "registrForm.username.$error.required">User Name is required.</span>
                     </span>
                    </div>
                    <div class="form-group">
                            <label for="exampleInputPassword1">Password:</label>
                     
                            <form:password path="password" class="form-control"  placeholder="Password" ng-model="password" required="required" />
                      </div>
                    <span style = "color:red" ng-show = "registrForm.password.$dirty && registrForm.password.$invalid && registrForm.password.$touched">
                        <span ng-show = "registrForm.password.$error.required ">Password is required.</span>
                     </span>
                       
                            <button ng-disabled = "registrForm.firstname.$dirty && 
                            registrForm.firstname.$invalid && registrForm.firstname.$touched || registrForm.lastname.$dirty && registrForm.lastname.$invalid && registrForm.lastname.$touched || registrForm.email.$dirty && registrForm.email.$invalid && registrForm.email.$touched||registrForm.username.$dirty && registrForm.username.$invalid && registrForm.username.$touched||registrForm.password.$dirty && registrForm.password.$invalid && registrForm.password.$touched||registrForm.phone.$dirty && registrForm.phone.$invalid && registrForm.phone.$touched"  ng-click="submit()" id="login" class="btn btn-primary" name="login">Sign Up</button>
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
        <script>
         var mainApp = angular.module("mainApp", []);
         
         mainApp.controller('studentController', function($scope) {
            $scope.reset = function(){
               
              
            }
            
            $scope.reset();
         });
      </script>
        </body>
        </html>
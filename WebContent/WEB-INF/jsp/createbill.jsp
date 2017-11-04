
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Create Bill</title>
            <link href="bootstrap.min.css" rel="stylesheet">
                        <script src = "http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script> 
            
            <script>
         var mainApp = angular.module("mainApp", []);
         
        
         mainApp.controller('studentController', ['$scope','$compile', function($scope,$compile) {
        	    
        	    
        	    	 $scope.count = 1;
        	    	    $scope.myFunc = function() {
        	    	       
        	    	       $scope.count=$scope.count+1;
        	    	       var html='<div class="row">';
        	    	       html+='<div class="col-md-6"> <div class="form-group"> <label for="exampleInputEmail1" >Description of Goods: </label>';
        	    	       html+='<input type="text" name="desofgood" class="form-control"  placeholder="Enter Description of Goods " >';
        	    	       html+='</div>';
        	    	       html+='<div class="form-group"><label for="exampleInputEmail1"  > Part QTY(UNIT): </label>';
        	    	       html+='<input type="text" name="partqty" class="form-control"  placeholder="Enter Part QTY(UNIT)  " >'; 
        	    	       html+='</div>';
        	    	       html+='<div class="form-group"><label for="exampleInputEmail1"  >HSN Code: </label>';
        	    	       html+='<input type="text" name="hsncode" class="form-control"  placeholder="Enter HSN Code " >'
        	    	       html+='</div></div>';
							html+='<div class="col-md-6"><div class="form-group"><label for="exampleInputEmail1"  >Part No: </label>'; 
							html+='<input type="text" name="partnumber" class="form-control"  placeholder="Enter Part Number " >'
							html+='</div><div class="form-group"><label for="exampleInputEmail1"  >Part Price: </label>';
							html+='<input type="text" name="partprice" class="form-control"  placeholder=" Enter Part Price " >'; 
							html+='</div></div></div>';
        	    	       var source = angular.element( document.querySelector( '#cabdata' ));
        	    	       var container = angular.element( document.querySelector( '#cabcontainer' ));

        	    	       var uniqueid='cabdata'+$scope.count;
        	    	       var temp= $compile(source.clone().attr('id',uniqueid))($scope);
        	    	       container.append(html);
        	    	    };
        	  }]);
      </script>
        </head>
        <body ng-app = "mainApp" ng-controller = "studentController" >
        
        <jsp:include page="navbar.jsp" />
        <div class="container">
        <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
        <h4><p class="text-primary">Customer Details</p></h4>
            <form:form  modelAttribute="bill"  action="createBillProcesses.htm" method="post">
            
           <div class="row">
           
          
           <div class="col-md-6">
                <div class="form-group">

                            <label for="exampleInputEmail1"  >Customer Name: </label>
                        
                            <form:input path="customername" class="form-control"  placeholder="Enter Customer Name"  />
                    </div>
                    
                    <div class="form-group">

                            <label for="exampleInputEmail1"  >Customer Address: </label>
                        
                            <form:input path="customeraddress" class="form-control"  placeholder="Enter Customer Address"  />
                    </div>
                    <div class="form-group">

                            <label for="exampleInputEmail1"  >Customer GSTTIN: </label>
                        
                            <form:input path="customergsttin" class="form-control"  placeholder="Enter Customer GSTTIN"  />
                    </div>
                    </div><div class="col-md-6">
                    <div class="form-group">

                            <label for="exampleInputEmail1"  >PO No: </label>
                        
                            <form:input path="pono" class="form-control"  placeholder="Enter PO No"  />
                    </div>
                   
                <div class="form-group">

                            <label for="exampleInputEmail1"  >PO Date: </label>
                        
                            <form:input path="podate" class="form-control"  placeholder="Enter PO Date"  />
                    </div>
                    
                    </div>
                   
                  </div> 
                    <div><h4><p class="text-primary">Parts Details</p></h4></div>
                     <div id="cabdata" class="row">
           
          <%-- 
           <div class="col-md-6">
                     <div class="form-group">

                            <label for="exampleInputEmail1"  >Description of Goods: </label>
                        
                            <form:input path="desofgood" class="form-control"  placeholder="Enter Description"  />
                    </div>
                    <div class="form-group">
                            <label for="exampleInputPassword1"> Part QTY(UNIT):</label>
                        
                        
                            <form:input path="partqty" class="form-control"  placeholder="Enter QTY"  />
                      </div> 
                      
                         <div class="form-group">

                            <label for="exampleInputEmail1"  >HSN Code: </label>
                        
                            <form:input path="hsncode" class="form-control"  placeholder="Enter HSN Code"  />
                    </div>
                      
                       </div>
           
          
           <div class="col-md-6">
           <div class="form-group">
                            <label for="exampleInputPassword1">Part No:</label>
                        
                        
                            <form:input path="partnumber" class="form-control"  placeholder="Enter Part Number"  />
                      </div>
             
                    
                      <div class="form-group">
                            <label for="exampleInputPassword1">Part Price:</label>
                        
                        
                            <form:input path="partprice" class="form-control"  placeholder="Enter Part Price"  />
                      </div>
                      
                      
                    
                     
                     
                     
                      </div>
                                --%>                  
                     
                     </div>
                     <div id="cabcontainer"  ></div>
                     <a href=# id="part" class="btn btn-primary" name="part" ng-click="myFunc();">Add parts</a>
                     <div><h4><p class="text-primary">Labour Details</p></h4></div> 
                      <div class="row">
           
          
           
                    
                     
           
          
           <div class="col-md-6">
           <div class="form-group">
           <div class="form-group">
                            <label for="exampleInputPassword1">Labour Name:</label>
                        
                        
                            <form:input path="labourname" class="form-control"  placeholder="Enter Part Number"  />
                      </div>

                            <label for="exampleInputEmail1"  >Description of Labour: </label>
                        
                            <form:input path="labourdescription" class="form-control"  placeholder="Enter PO Date"  />
                    </div>
                    
                     </div>                   
                      
           
          
           <div class="col-md-6">
            <div class="form-group">
                            <label for="exampleInputPassword1">Labour Price:</label>
                        
                        
                            <form:input path="labourprice" class="form-control"  placeholder="Enter Part Price"  />
                      </div>
                    <div class="form-group">

                            <label for="exampleInputEmail1"  >Labour Amount: </label>
                        
                            <form:input path="labour" class="form-control"  placeholder="Enter Labour"  />
                    </div>
           </div></div>
                            <button id="login" class="btn btn-primary" name="login">Submit</button>
                    <a id="cancel" class="btn btn-primary" name="cancel" href="createBill.htm">cancel</a>
                    </div>
                
            </form:form>
            </div>
            <div class="col-md-2"></div>
            </div>
            
        </body>
        </html>
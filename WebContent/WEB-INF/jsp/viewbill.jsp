<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill List</title>
            <link href="bootstrap.min.css" rel="stylesheet">

</head>
<body>
  <jsp:include page="navbar.jsp" />
<div class="container">


  <h4><p class="text-primary">Bills Detail</p></h4>



<table class="table table-hover ">
  <thead>
    <tr>
      <th scope="col">Invoice Number</th>
     <th scope="col">Customer Name</th> 
      <th scope="col">customer Address</th>
      <th scope="col">Customer GST TIN</th>
      <th scope="col">Po Number</th>
      <th scope="col">Po Date</th>
      <th scope="col">labour Name</th>
      <th scope="col">Labour Description</th>
      
      <th scope="col">Labour Price</th>
      <th scope="col">Total Labour </th>
      <th scope="col">Print Bill</th>
    </tr>
  </thead>
  <c:forEach var="o" items="${billlist}">
  <tbody>
    <tr>
      <th scope="row">${o.billid}</th>
      <td>${o.customername}</td>
       <td>${o.customeraddress}</td> 
      <td>${o.customergsttin}</td>
    <td>${o.pono}</td>
      <td>${o.podate}</td>
      <td>${o.labourname}</td>
       <td>${o.labourdescription}</td> 
      <td>${o.labourprice}</td>
      <td>${o.labour}</td>
      <td><a href="downloadPDF.htm?billid=${o.billid}" class="btn btn-primary" target="_blank">Print Bill</a></td>
      
      
    </tr>
    
  </tbody>
  </c:forEach>
</table>
</div>

</body>
</html>
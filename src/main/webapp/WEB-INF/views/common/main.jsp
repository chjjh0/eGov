<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet icon" href="${context}/resources/img/favicon.ico">
    <link rel="stylesheet" href="${context}/resources/css/style.css" />
    <script src="${context}/resources/js/app.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    
    <title>Business Casual - Start Bootstrap Theme</title>
	
    <!-- Bootstrap core CSS -->
    <link href="${context}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${context}/resources/css/business-casual.min.css" rel="stylesheet">

  </head>
  <body id="page-top"> 	
	<div id="navi">
		<tiles:insertAttribute name="navi"/>
	</div> 
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div> 
	<div id="content">
		<tiles:insertAttribute name="content"/>
	</div> 
	<div id="footer">
		<tiles:insertAttribute name="footer"/>
	</div> 
	
	<!-- Bootstrap core JavaScript -->
    <script src="${context}/resources/vendor/jquery/jquery.min.js"></script>
    <script src="${context}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    
    <script>
	app.init('${context}');
	/* $('#login_btn').click(function(){
		alert('로그인 성공');
	}); */
	</script>
    </body>
</html>
    
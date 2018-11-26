<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register here</title>
</head>
<body>
	<form class="form" action="requestsell" method=post style="padding-top:40px;">
			  <div class="form-row" style="width:550px">
				<h4>Enter Details</h4>
			  	<div class="form-group col-md-12">
			    	<br><label for="inputCropType">Crop Type</label>
			    	<input type="text" class="form-control" name="inputCropType" >
			  	</div>
			    <div class="form-group col-md-12">
			    	<br><label for="inputCropName">Crop Name</label>
			    	<input type="text" class="form-control" name="inputCropName">
			  	</div>	  	
			  		<div class="form-group col-md-12">
			    	<br><label for="iputFertilizerType">Fertilizer Type</label>
			    	<input type="text" class="form-control" name="inputFertilizerType" >
			  	</div>
			  		<div class="form-group col-md-12">
			    	<br><label for="inputQuantity">Quantity</label>
			    	<input type="text" class="form-control" name="quantity" >
			  	</div>
			  	 <button type="submit" class="btn btn-primary" style="align-items: center" >Place Request</button>
</div>
</form>
</body>
</html>

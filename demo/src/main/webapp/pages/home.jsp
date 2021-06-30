<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <head>
      <title>The jQuery Example</title>
      <script type = "text/javascript" 
         src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js">
      </script>

      <script type = "text/javascript" language = "javascript">
      $(document).ready(function() {
    	    $('#example').DataTable( {
    	        ajax:           "../data/2500.txt",
    	        deferRender:    true,
    	        scrollY:        200,
    	        scrollCollapse: true,
    	        scroller:       true
    	    } );
    	} );
      </script>
   </head>
	
</head>
<body>

<h1>Hi Welcome to Fuse Mapper</h1>
<form action="addCP">
<input type="text" name="upstreamalias"/>
<input type="text" name="downstreamalias"/>
<input type="text" name="value"/>
<inut type="submit">

<table id="example" class="display nowrap" style="width:100%">
        <thead>
            <tr>
                <th>upstreamapp</th>
                <th>person name</th>
                <th>instrumentname</th>
                <th>upstreamalias</th>
                <th>downstreamalias</th>
                 <th>downsstreamapp</th>
            </tr>
        </thead>
    </table>


</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Log this!</title>
    </head>
    <body>
		<form action="LogServlet" method="post">  
			<input type="text" name="logstring" value="Log string..." onclick="this.value=''"/><br/>  
			<input type="submit" value="Submit"/>  
		</form>
    </body>
</html>
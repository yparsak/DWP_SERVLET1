<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <body>

	  Get Method <br />
      <form action="Sample" method="GET">
         First Name: <input type="text" name="first_name">
         <br />
         Last Name: <input type="text" name="last_name" />
         <input type="submit" value="Submit" />
      </form>
      <br />

	  Post Method <br />
      <form action="Sample" method="POST">
         First Name: <input type="text" name="first_name">
         <br />
         Last Name: <input type="text" name="last_name" />
         <input type="submit" value="Submit" />
      </form>

   </body>
</html>
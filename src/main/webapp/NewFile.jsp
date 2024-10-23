<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calc JSP Page</title>
    <style>
    h3{
    color:white;
    }
        img {
            height: 9%;
            width: 30%;
        }
        body {
            text-align: center;
            background-image: url('images/background.jpg'); /* Using relative path */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
        
        input, button {
   			font-size:30px;
   			color:#D4AF37;
   			background-color:black;
   			border: 2px solid #D4AF37;
   			border-radius:10%;     
        }
        
        img{
			width: 20%;
			height:20%;
			margin-top: 25px;
			border-radius:5%;
			}
		img:hover{
 		 -ms-transform: scale(1.1); /* IE 9 */
  		 -webkit-transform: scale(1.1); /* Safari 3-8 */
  		  transform: scale(1.1); 
}
        
    </style>
</head>
<body>   
    <img src="images/laughing.gif" alt="laugh emoji GIF"> <!-- Relative path for the image -->
    <h1>Joke, OF The Day!</h1>
    <h3>😊<%=request.getParameter("joke") %></h3>
    
    <form action="MyServlet" >
    <input name="num1" placeholder="First Number"></input>
    <input name="num2" placeholder="Second Number"></input>
    
    <button name="bt1" value="1">+</button>
    <button name="bt1" value="2">-</button>
    <button name="bt1" value="3">x</button>
    <button name="bt1" value="4">/</button>
    </form> 
    
    <h1>Ans=<%=request.getParameter("ans") %></h1>
</body>
</html>

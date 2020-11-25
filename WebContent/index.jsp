<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Assignment8</title>

 <script language="JavaScript">
    function validate(form1)
    { if (form1.bool1.value == "" || form1.bool2.value == "" || form1.operation.value == "")
        { alert("One of the field is empty.")
            form1.bool1.focus()
            form1.bool1.select()
            form1.bool2.focus()
            form1.bool2.select()
            form1.operation.focus()
            form1.operation.select()
            return false
        }
    
    else if(!(form1.operation.value == "&&" || form1.operation.value == "AND" || form1.operation.value == "OR" || form1.operation.value == "||"))
    { 
    	alert("Operator has to be either AND, &&, OR, ||")
        form1.operation.focus()
        form1.operation.select()
        return false
    }

    	
    return true}
    </script>

</head>
<body>
<h1>Assignment 8 By Rajaram and Kshitiz</h1>

<h3> UI instructions:</h3>
<p> The first UI let's user enter Boolean and its operator. For "First Boolean"" enter your Boolean value, and for "Second Boolean" enter your second Boolean value. Enter one of the options provided for the operator. Operator must be either
 "&&","AND","||","OR". Click on "Calculate Predicate" to view your result which will print out the truth table based on the operator you have provided. Also, you can click "reset" button if you wish to erase Boolean variables and operators from the text field. 
 </p>

<form method="GET" action="Main.do"
    onSubmit="return validate(this)">
	Enter First Boolean: <input type="text" name = "bool1"><br>
	<br>
	Enter Operator(" && , AND, OR, ||") : <input type="text" name = "operation"><br>
	<br>
	Enter Second Boolean: <input type="text" name = "bool2"><br>
	<br>
	<input type = "submit" value = "Calculate the Predicate"/>
	<input type = "reset" value = "Reset" />
</form>



</body>
</html>
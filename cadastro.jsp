<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicio</title>
</head>
<body align="center">


<form action="cadastro" method="post" class="fundo">
	<fildset>
	<H3>ATENÇÃO!!! os pedidos serão feitos através do CPF</H3>
CPF: <input type="number" name="cpf" required><br/>
Nome: <input type="text" name="nome" required><br/>
Setor: <input type="text" name="setor" required> <br/>
Prédio I <input type="radio" name="predio" value="1"> <br/>
Prédio II <input type="radio" name="predio" value="2" checked="checked"> <br/>
		
		<label for="andar">Andar: </label>
    	<select name="andar"> 
    		<option value="1">1</option> 
    		<option value="2">2</option> 
    		<option value="3">3</option> 
    		<option value="4">4</option> 
    		<option value="5">5</option> 
    		<option value="6">6</option> 
    		<option value="7">7</option> 
    		<option value="8">8</option> 
    		<option value="9">9</option> 
    		<option value="10">10</option> 
   		</select>
   		<br/>
   		<br/>
		<input type = "submit" value="Enviar">
		<br/>
		<fildset/>
		<br/>
		</form>


</body>
</html>
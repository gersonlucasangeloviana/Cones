<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ include file="menu.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado</title>
</head>
<body>

<%--
scriptless
	out.print("<p>" + request.getParameter("nome") + "</p> <br/>" );
	out.print("<p>" + request.getParameter("idade") + "</p> <br/>" );

 --%>

<div class="transparente">

<p> Cadastro Efeturado!<p>
<p>CPF : <c:out value="${cliente.cpf}"/></p>
<H3>ATENÇÃO!!! os pedidos serão feitos através do CPF</H3>
<H3>Se o CPF estiver errado realize um novo cadastro com o CPF correto!!!</H3>
<p>Nome: <c:out value="${cliente.nome}"/></p>
<p>Setor: <c:out value="${cliente.setor}"/></p>
<p>Prédio: <c:out value="${cliente.predio}"/></p>
<p>Andar: <c:out value="${cliente.andar}"/></p>
    </div>
</body>
</html>
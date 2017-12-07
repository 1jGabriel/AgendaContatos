<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Contato"%>
<%@page import="dao.ContatoDAO"%>
<html>
<head>
<title>Agenda</title>
<link rel="StyleSheet" type="text/css" href="css/style.css"
	media="screen">
</head>
<body>
	<%-- <center> --%>

	<div style="text-align: -webkit-center;">
		<h3 class="div-top">Projeto Agenda</h3>
		<table border="1" cellpadding="1"
			style="margin-bottom: 3%; width: 80%;">

			<tr>
				<th style="width: 20em;">Nome</th>
				<th style="width: 10em;">Celular</th>
				<th style="width: 10em;">Telefone</th>
				<th style="width: 15em;">Email</th>
				<th style="width: 8em;"></th>
			</tr>

		<%	
			Object buscarNomeId = session.getAttribute("buscarNomeId");
			Contato contato = new ContatoDAO().consultar(new Integer(buscarNomeId.toString()));			
		%>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getCelular() %></td>
			<td><%=contato.getTelefone()%></td>
			<td><%=contato.getEmail()%></td>
			<%
				request.setAttribute("contato", contato);
			%><td><a
				href="/projeto-agenda/Editar?id=${contato.getId()}">Modificar</a>
				&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="/projeto-agenda/Deletar?id=${contato.getId()}">Excluir</a></td>
			</tr>
		
		</table>
	</div>

</body>
</html>
</body>
</html>
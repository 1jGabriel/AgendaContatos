<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Contato"%>
<%@page import="dao.ContatoDAO"%>
<html>
<head>
<title>Editar Contato</title>
<link rel="StyleSheet" type="text/css" href="css/style.css"
	media="screen">
</head>
<body>
	<form action="Editar" method="post">
		<div style="text-align: -webkit-center;">
			<h3 class="div-top">Editar Contato</h3>
			<table cellpadding="5" style="margin-bottom: 3%; width: 80%;">

				<%
					Object idConsulta = session.getAttribute("idConsulta");
					Contato contato = new ContatoDAO().consultar(new Integer(idConsulta.toString()));
				%>

				<%
					request.setAttribute("contato", contato);
				%>

				<c:if test="${contato != null}">
					<input type="hidden" name="contatoId"
						value="<c:out value='${contato.getId()}' />" />
				</c:if>



				<tr>
					<th style="width: 15em;">Nome:</th>
					<td style="width: 80em;"><input type="text" name="nome"
						style="width: 100%;" 
						value="${contato.getNome()} "/></td>
				</tr>
				<tr>
					<th style="width: 15em;">Celular:</th>
					<td style="width: 80em;"><input type="text" name="celular"
						style="width: 100%;" 
						value="${contato.getCelular()} "/></td>
				</tr>
				<tr>
					<th style="width: 15em;">Telefone:</th>
					<td style="width: 80em;"><input type="text" name="telefone"
						style="width: 100%;" 
						value="${contato.getTelefone()} "/></td>
				</tr>
				<tr>
					<th style="width: 15em;">Email:</th>
					<td style="width: 80em;"><input type="text" name="email"
						style="width: 100%;" 
						value="${contato.getEmail()} "/></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Salvar" /></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<div style="display: flex;" align="center">
		
		<div class="div-home">
			<div style="padding-top: 15%;margin-bottom: 15%;margin-left: 3%;margin-right: 3%;">
				<a href="/projeto-agenda/listaContatos.jsp" style="color:#ffffff">Ir para a agenda com a lista de contatos</a>
			</div>
			<div style="padding-top: 15%;margin-bottom: 15%;margin-left: 3%;margin-right: 3%;">
				<form action="BuscarNome">
			<input type="text" name="buscarNome"
				value="Buscar contato por nome:" 
				style=" width: 20%;margin-top: 1%; " /><input type="submit" value="Submit" />
		</form>
			</div>
		</div>
	</div>
</body>
</html>
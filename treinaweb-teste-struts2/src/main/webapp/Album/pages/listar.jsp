<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<h2>Lista de álbuns</h2>
	<br />
	<a href="/TreinaWebStruts2Teste/Album/Inserir">Inserir Album</a>
	<br />
	<s:if test="modelos.size() > 0">
		<table style="border: 1px">
			<thead>
				<td>ID do álbum</td>
				<td>Nome do álbum</td>
				<td>Ano do álbum</td>
				<td>Ações</td>
			</thead>
			<tbody>
				<s:iterator value="modelos">
					<tr>
						<s:url action="Alterar" var="urlAtualizar">
							<s:param name="id" value="id"/>
						</s:url>
						<s:url action="Excluir" var="urlExcluir">
							<s:param name="id" value="id"/>
						</s:url>
						<td><s:property value="id"/></td>
						<td><s:property value="nome"/></td>
						<td><s:property value="ano"/></td>
						<td><s:a href="%{urlAtualizar}">Atualizar</s:a> |
							<s:a href="%{urlExcluir}">Excluir</s:a>
						</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</s:if>
	<s:else>
		<i>Não existem álbuns cadastrados...</i>
	</s:else>
</body>
</html>
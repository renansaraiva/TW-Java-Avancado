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
	<h2>Lista de �lbuns</h2>
	<br />
	<s:if test="modelos.size() > 0">
		<table style="border: 1px">
			<thead>
				<th>
					<td>ID do �lbum</td>
					<td>Nome do �lbum</td>
					<td>Ano do �lbum</td>
				</th>
			</thead>
			<tbody>
				<s:iterator value="modelos">
					<tr>
						<td><s:property value="id"/></td>
						<td><s:property value="nome"/></td>
						<td><s:property value="ano"/></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</s:if>
	<s:else>
		<i>N�o existem �lbuns cadastrados...</i>
	</s:else>
</body>
</html>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Inser��o de m�sica</title>
</head>
<body>
	<h2>Inser��o de m�sica</h2>
	<br />
	<br />
	<s:form action="InserirMusica">
		<s:textfield label="T�tulo da M�sica" name="modelo.nome" />
		<s:select label="�lbum" headerKey="-1"
			headerValue="Selectione um �lbum..." list="albuns" name="albumId"
			listKey="id" listValue="nome"/>
		<s:submit value="Inserir"/>
	</s:form>
</body>
</html>